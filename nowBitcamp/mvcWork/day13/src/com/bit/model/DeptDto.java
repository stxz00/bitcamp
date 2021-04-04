package com.bit.model;

public class DeptDto {
	private int deptno;
	private String dname,loc;
	public DeptDto() {} //정해진 약속 디폴트 생성자 만들기
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
