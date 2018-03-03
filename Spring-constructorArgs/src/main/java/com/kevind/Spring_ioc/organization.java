package com.kevind.Spring_ioc;

public class organization {
	
	private String companyName;
	private int yearOfIncorporation;
	
	public organization() {
		companyName = "my Company";
		yearOfIncorporation = 1992;
	}
	public organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}



	public void corporateSlogan() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	}



	@Override
	public String toString() {
		return "organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
