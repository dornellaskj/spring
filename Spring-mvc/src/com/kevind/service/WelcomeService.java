package com.kevind.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {

	public List<String> getWelcomeMessage(String name) {
		List<String> result = new ArrayList<String>();
		result.add("Hello! ");
		result.add(name);
		result.add(", welcome to Spring");
		return result;
	}
}
