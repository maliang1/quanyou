package com.maliang.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.maliang.service.user.impl.UserService;
import com.maliang.vo.user.User;

@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	private UserService userService;
//	
//	@RequestMapping("redis")
//	@ResponseBody
//	public User testRedis(String name){
//		
//		
//		User user= service.getUser(name);
//		return user;
//	}
	@RequiresAuthentication
	@RequiresPermissions("admin")
	@RequestMapping("test")
	public @ResponseBody String test(HttpServletRequest req){
		
		
		return "sdfsdfs";
	}
	
	@RequestMapping("UnLogin")
	public String testUnLogin(HttpServletRequest req,HttpServletResponse resp){
		Map map=new HashMap<>();
		map.put("error", "未登陆");
		
		return ObjectToJson(map);
	}
	
	@RequestMapping("login")
	public @ResponseBody String login(String username,String password){
			Map map=new HashMap<>();
			
			if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
				return ObjectToJson(map);
			}
			User user = userService.getUser(username);
			if(user==null){
				map.put("error", "用户不存在");
				return ObjectToJson(map);
			}
			UsernamePasswordToken token=new UsernamePasswordToken(username, password.toCharArray());
			try {
				SecurityUtils.getSubject().login(token);
				
				map.put("user", SecurityUtils.getSubject().getPrincipal().toString());
				return ObjectToJson(map);
			} catch (Exception e) {
				e.printStackTrace();
				map.put("error", e.getMessage());
				return ObjectToJson(map);
			}  
			
	}
	
	
	private String ObjectToJson(Object o){
		Gson gson;
		try {
			gson = GsonBuilder.class.newInstance().create();
			return gson.toJson(o);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
