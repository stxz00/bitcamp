package com.bit.sts12.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.sts12.model.DeptDao;
import com.bit.sts12.model.entity.DeptVo;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	SqlSessionTemplate template;
	@Autowired
	SqlSessionFactory factory;
	String daoInfo=DeptDao.class.getTypeName();
	
	@Override
	public List<DeptVo> list() {
		return template.selectList(DeptDao.class.getTypeName()+"selectAll");
	}
	
	@Override
	public DeptVo bean(int deptno) {
		return template.selectOne(DeptDao.class.getTypeName()+".selectOne");
	}
	
	@Override
	public void add(DeptVo bean) {
		template.insert(DeptDao.class.getTypeName()+".insertOne");
	}
	
	@Override
	public int edit(DeptVo bean) {
		return template.update(DeptDao.class.getTypeName()+".updateOne");
	}
	
	@Override
	public int delete(int deptno) {
		return template.delete(DeptDao.class.getTypeName()+".deleteOne");
	}
}












