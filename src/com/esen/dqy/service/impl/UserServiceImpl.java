package com.esen.dqy.service.impl;

import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esen.dqy.dao.CompanyInfoDao;
import com.esen.dqy.entity.User;
import com.esen.dqy.service.IBaseService;

@Service("USERSERVICE")
public class UserServiceImpl implements IBaseService<User> {
	
	@Autowired
	CompanyInfoDao dao;

	public User delete(String id) {
		return null;
	}

	public User query(String id) {
		return new User(id, new SimpleHash("md5", id).toHex());
	}

	public List<User> list() {
		return null;
	}

	@Transactional
	public User add(User entity) {
		System.out.println("User add");
		return entity;
	}

	public User update(String id, User entity) {
		return null;
	}

}
