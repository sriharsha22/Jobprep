package com.jsp.javabean;

public class Employee {
	
	public int eno;
	public String ename;
	public String esal;
	public String euser;
	
	public Employee() {}
	
	public Employee(int eno, String ename, String esal, String euser) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.euser = euser;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getEuser() {
		return euser;
	}
	public void setEuser(String euser) {
		this.euser = euser;
	}

}
