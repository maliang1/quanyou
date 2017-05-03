package com.maliang.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class HeaderFilter implements Filter{

    @Override
    public void destroy() {
        
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
        throws IOException, ServletException {
        HttpServletResponse response=(HttpServletResponse)resp;
        
       
      //设置跨域请求
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
        try {
        	 chain.doFilter(req, response);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.getOutputStream().write("无权限".getBytes());
		}
       
    }

    @Override
    public void init(FilterConfig arg0)
        throws ServletException {
        
    }

}
