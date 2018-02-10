package com.esen.dqy.service;

import java.util.List;

public interface IUserInfoMgr<T> {
	public T delete(String id);
	public T query(String id);
	public List<T> list();
	public T add(T entity);
	public T update(String id, T entity);
}
