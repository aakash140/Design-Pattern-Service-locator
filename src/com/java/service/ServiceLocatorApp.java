package com.java.service;

public class ServiceLocatorApp {

	public static void main(String[] args) {
		ServiceLocator serviceLocator=new ServiceLocator();
		Service service=serviceLocator.getService("First");
		service.execute();
		service=serviceLocator.getService("Second");
		service=serviceLocator.getService("Second");
	}
}