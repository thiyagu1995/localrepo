package com.flp.ems.domain;

import java.sql.Date;

import javax.jws.soap.SOAPMessageHandlers;

public class Employee {

	String Name,Address,EmailId;
	static int EmployeeId=0;
	static String KinId=null;
	int PhoneNo,DepartmentId,ProjectId,RolesId;
	Date dob,doj;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	public String getAddress() {
		return Address;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDob() {
		return dob;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
		public Date getDoj() {
		return doj;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public int getDepartmentId() {
		return DepartmentId;
	}
	public int getEmployeeId() {
		return EmployeeId++;
	}
	public String getKinId() {
		return "Emp"+KinId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setRolesId(int rolesId) {
		RolesId = rolesId;
	}
	public int getRolesId() {
		return RolesId;
	}
	@Override
	public int hashCode() {
		System.out.println("used for bucket selection..." + KinId+ "/"+KinId.hashCode());
	return KinId.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("checking for duplicates...");
	
		boolean flag = this.KinId == ((Employee)o).KinId;
		return flag;
		
		
	}
	
}
