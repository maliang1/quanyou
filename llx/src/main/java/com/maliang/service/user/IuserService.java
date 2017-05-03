package com.maliang.service.user;

import java.util.List;

import com.base.serviceApi.service.GenericService;
import com.maliang.vo.user.User;
public interface IuserService extends GenericService<User>{
	
	
	
	public List<User> queryForList(User user);

	List<User> queryFor1();

	public User login(String username, char[] password);

}
