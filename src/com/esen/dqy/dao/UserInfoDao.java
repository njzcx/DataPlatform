package com.esen.dqy.dao;

public interface UserInfoDao<T> {
	public abstract T selectOne(String id);
	
	public abstract void addUser(T entity);
}
