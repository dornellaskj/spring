package com.kevindornellas.serviceimpl;

import java.util.Random;

import com.kevindornellas.spring.di.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offersService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" provides an outstanding Ecommerce platform." +
				"\nThe annual revenue exceeds " + random.nextInt(revenue)+ " dollars";
		return service;
	}

}
