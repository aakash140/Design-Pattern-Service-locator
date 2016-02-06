package com.java.service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	List<Service> serviceList;
	
	public Cache(){
		serviceList=new ArrayList<Service>();
	}
	
	public void addService(Service newService){
		boolean isServiceAvailable=false;
		for(Service service:serviceList)
			if(service.getName().equalsIgnoreCase(newService.getName()))
				isServiceAvailable=true;
		if(!isServiceAvailable)
			serviceList.add(newService);
	}
	
	public Service getService(String serviceName){
		for(Service service:serviceList)
			if(service.getName().equalsIgnoreCase(serviceName))
				return service;
			 
			return null;
	}
}