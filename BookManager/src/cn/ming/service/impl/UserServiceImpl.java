package cn.ming.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ming.dao.UserDao;
import cn.ming.pojo.User;
import cn.ming.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(name);
	}

}
