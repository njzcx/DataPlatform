package com.esen.dqy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.esen.dqy.dao.UserInfoDao;

public class UserInfoMgrImpl<T> implements IUserInfoMgr<T> {
	
	@Autowired
	UserInfoDao<T> dao;

	public T delete(String id) {
		return null;
	}

	public T query(String id) {
		return null;
	}

	public List<T> list() {
		return null;
	}
	
	public T add(T entity) {
		return dao.selectOne("123");
	}

	public T update(String id, T entity) {
		return null;
	}

}
