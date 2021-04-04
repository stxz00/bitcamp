package com.bit.sts03.dept.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.sts03.dept.model.entity.DeptVo;

public class DeptDao01ImplTest {
	DeptDao<DeptVo> deptDao;

	static DeptVo target;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		target=new DeptVo(99,"test","test");
	}

	@Before
	public void setUp() throws Exception {
		ApplicationContext context;
		context=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		deptDao=context.getBean(DeptDao.class);
	}

	@Test
	public void testSelectAll() throws SQLException {
		assertNotNull(deptDao.selectAll());
	}

	@Test
	public void testSelectOne() throws SQLException {
		assertEquals(target,deptDao.selectOne(target.getDeptno()));
	}

	@Test
	public void testInsertOne() throws Exception {
		try {
			deptDao.insertOne(target);
			fail("�Է½���");
		}catch (org.springframework.dao.DataIntegrityViolationException e) {
		}
	}

	@Test
	public void testUpdateOne() throws SQLException {
		DeptVo edit=new DeptVo(target.getDeptno(),"edit","edit");
		assertSame(1, deptDao.updateOne(edit));
	}

	@Test
	public void testDeleteOne() throws SQLException {
		assertSame(1, deptDao.deleteOne(target.getDeptno()));
	}

}
