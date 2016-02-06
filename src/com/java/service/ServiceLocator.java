package com.java.service;

public class ServiceLocator {
	public static Cache cache;
	
	public ServiceLocator(){
		cache=new Cache();
	}
	
	public Service getService(String serviceName){
		Service service=cache.getService(serviceName);
		if(service!=null)
			return service;
		
		Context context=new Context();
		service=context.getService(serviceName);
		cache.addService(service);
		return service;
	}
}