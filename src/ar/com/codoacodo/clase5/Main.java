package ar.com.codoacodo.clase5;

import ar.com.codoacodo.clase5.service.DTO;
import ar.com.codoacodo.clase5.service.IService;
import ar.com.codoacodo.clase5.service.impl.ServiceFactory;

public class Main {

	public static void main(String[] args) {

		String env = "fs";// rest | fs //f6

		IService service = ServiceFactory.getService(env);
		
		//ahora que hago????
		DTO dto = service.invoke();
		
		//return al front
		System.out.println(dto);
	}

}
