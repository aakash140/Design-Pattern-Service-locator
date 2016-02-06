package com.java.service;


public class Context {
	
	public Service getService(String serviceName){
		if(serviceName.equalsIgnoreCase("First"))
			return new FirstService();
		else if(serviceName.equalsIgnoreCase("Second"))
			return new SecondService();
		else
			return null;
	}
}