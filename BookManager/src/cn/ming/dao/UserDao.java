package cn.ming.dao;

import org.apache.ibatis.annotations.Select;

import cn.ming.pojo.User;

public interface UserDao {
    @Select("select password from user where name=#{name}")
	public User getUserByName(String name);
	
	
	
}
