package com.kevindornellas.serviceimpl;

import java.util.Random;

import com.kevindornellas.spring.di.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offersService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" offers world class Cloud Computing infrastructure." +
				"\n The annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
