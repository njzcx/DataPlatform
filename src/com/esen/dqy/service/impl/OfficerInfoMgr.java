package com.esen.dqy.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esen.dqy.dao.OfficerInfoDao;
import com.esen.dqy.dao.UserInfoDao;
import com.esen.dqy.entity.OfficerInfo;
import com.esen.dqy.service.IUserInfoMgr;

@Service("OFFICERINFOMGR")
public class OfficerInfoMgr implements IUserInfoMgr<OfficerInfo> {
	
	@Autowired
	OfficerInfoDao dao;

	public OfficerInfo delete(String id) {
		return null;
	}

	public OfficerInfo query(String id) {
		return null;
	}

	public List<OfficerInfo> list() {
		return null;
	}

	@Transactional
	public OfficerInfo add(OfficerInfo entity) {
		System.out.println("OfficerInfo add");
		entity.setId(UUID.randomUUID().toString());
		dao.addUser(entity);
		return entity;
	}

	public OfficerInfo update(String id, OfficerInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
