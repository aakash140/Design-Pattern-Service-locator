package com.java.service;

public class SecondService implements Service {

	@Override
	public void execute() {
		System.out.println("Executing Second Serivce");
	}

	@Override
	public String getName() {
		return new String("Second");
	}
}