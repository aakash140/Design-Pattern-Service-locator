package com.java.service;

public class FirstService implements Service {

	@Override
	public void execute() {
		System.out.println("Executing First Servie");
	}

	@Override
	public String getName() {
		return new String("First");
	}
}