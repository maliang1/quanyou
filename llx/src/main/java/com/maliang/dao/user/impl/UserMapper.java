package com.maliang.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.base.serviceApi.dao.impl.BaseDaoImpl;
import com.maliang.dao.user.IuserDao;
import com.maliang.vo.user.User;
/**
 * 测试
 * @author maliang
 *
 */
@Repository
public class UserMapper extends BaseDaoImpl<User> implements IuserDao  {

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("getUserByName", name);
	}

}
