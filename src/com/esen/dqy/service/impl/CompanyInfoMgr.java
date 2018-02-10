package com.esen.dqy.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esen.dqy.dao.CompanyInfoDao;
import com.esen.dqy.entity.CompanyInfo;
import com.esen.dqy.service.IUserInfoMgr;

@Service("COMPANYINFOMGR")
public class CompanyInfoMgr implements IUserInfoMgr<CompanyInfo> {
	
	@Autowired
	CompanyInfoDao dao;

	public CompanyInfo delete(String id) {
		return null;
	}

	public CompanyInfo query(String id) {
		return null;
	}

	public List<CompanyInfo> list() {
		return null;
	}

	@Transactional
	public CompanyInfo add(CompanyInfo entity) {
		System.out.println("CompanyInfo add");
		entity.setId(UUID.randomUUID().toString());
		dao.addUser(entity);
		return entity;
	}

	public CompanyInfo update(String id, CompanyInfo entity) {
		return null;
	}

}
