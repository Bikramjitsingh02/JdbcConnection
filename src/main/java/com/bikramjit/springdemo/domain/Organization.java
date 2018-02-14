package com.bikramjit.springdemo.domain;

public class Organization {
	
	private int id;
	private String companyName;
	private int yearOfCorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYearOfCorporation() {
		return yearOfCorporation;
	}
	public void setYearOfCorporation(int yearOfCorporation) {
		this.yearOfCorporation = yearOfCorporation;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
	

}
