package ar.com.codoacodo.clase5.service.impl;

import ar.com.codoacodo.clase5.service.IService;

public class ServiceFactory {

	//Map
	
	public static IService getService(String key) {
		return switch (key) {
			case "mysql": {
				yield new ServiceMysqlImpl();
			}
			case "fs": {
				yield new ServiceFSlImpl();
			}/*
			case "rest": {
				yield new ServiceRestImpl();
			}
			case "bla": {
				yield new ServiceBlaImpl();
			}*/
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
		};
	}
}
