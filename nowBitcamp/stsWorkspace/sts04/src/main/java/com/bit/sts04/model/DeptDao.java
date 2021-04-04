package com.bit.sts04.model;

import java.util.List;

import com.bit.sts04.model.entity.DeptVo;

public interface DeptDao {

	List<DeptVo> selectAll();
	List<DeptVo> selectAll(String keyword);
	List<DeptVo> selectAll(List list);

	DeptVo selectOne(int key);

	void insertOne(DeptVo bean);

	int updateOne(DeptVo bean);

	int deleteOne(int key);

}