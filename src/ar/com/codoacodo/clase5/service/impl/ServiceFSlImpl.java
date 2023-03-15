package ar.com.codoacodo.clase5.service.impl;

import ar.com.codoacodo.clase5.IConnection;
import ar.com.codoacodo.clase5.connection.FileSysteConnection;
import ar.com.codoacodo.clase5.connection.types.DataFile;
import ar.com.codoacodo.clase5.service.DTO;
import ar.com.codoacodo.clase5.service.IService;

public class ServiceFSlImpl implements IService {

	IConnection<DataFile> connection;
	
	public ServiceFSlImpl() {
		this.connection = new FileSysteConnection();
	}
	
	public DTO invoke() {
		
		DataFile resp = connection.execute();
		resp.setMonto(100d);
		
		return new DTO(resp.getMonto().longValue(), resp.getDni(),resp.getNombre());
	}

}
