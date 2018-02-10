package com.esen.dqy.dao;

import org.springframework.stereotype.Repository;

import com.esen.dqy.entity.CompanyInfo;
import com.esen.dqy.entity.OfficerInfo;

@Repository
public interface CompanyInfoDao extends UserInfoDao<CompanyInfo> {

}
