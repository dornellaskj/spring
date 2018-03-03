package com.kevindornella.springDomai;

import com.kevindornellas.spring.Service.RecruitmentService;

public class HumanResourceDept implements Department {

	private String deptName;
	private RecruitmentService recruitmentService;
	private organization org;
	
	public HumanResourceDept(RecruitmentService recruitmentService,
			organization org) {
		this.recruitmentService = recruitmentService;
		this.org = org;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(org.getCompanyName(), 
				deptName, numberOfRecruitments);
		return hiringFacts;
	}

}
