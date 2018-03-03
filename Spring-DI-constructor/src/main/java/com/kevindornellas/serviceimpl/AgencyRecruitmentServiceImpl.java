package com.kevindornellas.serviceimpl;

import java.util.Random;

import com.kevindornellas.spring.Service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random rand = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " +
		rand.nextInt(numberOfRecruitments) + " employees " + "using various hiring agencies.";
		return hiringFacts;
	}

}
