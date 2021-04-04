package com.bit.sts05.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.bit.sts05.model.entity.DeptVo;

@Transactional
public interface DeptService {
	void selectAll(Model model);
	void selectOne(Model model,int key);
	void insertOne(DeptVo bean);
	void updateOne(DeptVo bean);
	void deleteOne(int key);
}
