package com.kevindornella.springDomai;

import com.kevindornellas.spring.Service.BusinessService;

public class organization {
	
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	
	public organization() {
		companyName = "my Company";
		yearOfIncorporation = 1992;
	}
	public organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}



	public String getCompanyName() {
		return companyName;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String corporateSlogan() {
		return slogan;
	}
	
	public String corporateService() {
		return businessService.offersService(companyName);
	}
	
	@Override
	public String toString() {
		return "organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
