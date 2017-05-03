package com.maliang.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.serviceApi.service.impl.ServiceSupport;
import com.maliang.dao.user.impl.UserMapper;
import com.maliang.service.user.IuserService;
import com.maliang.vo.user.User;
//@Path("/rest")
//@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service
public class UserService extends ServiceSupport<User> implements IuserService{
	

	private UserMapper dao;
	@Autowired
	public UserService(UserMapper mapper) {
		super(mapper);
		dao=mapper;
	}

	private static int num=0;
//	@Cacheable(key="#name" ,cacheNames="ml")
	public User getUser(String name){
		User user = dao.getUserByName(name);
		return user;
	
	}

//	@GET
//	@Path("/getuserlist")
	@Override
	public List<User> queryForList(User user) {
		return this.queryPage(user).getList();
	}
//	@GET
//	@Path("/getuser")
	@Override
	public List<User> queryFor1() {
		
		return this.queryPage(new User(),"queryPage").getList();
	}

	@Override
	public User login(String username, char[] password) {
		User user=getUser(username);
		if(user!=null&&user.getPassword().equals(String.valueOf(password))){
			return user;
		}
		return null;
	}
	

}
