package ar.com.codoacodo.clase5.service.impl;

import ar.com.codoacodo.clase5.IConnection;
import ar.com.codoacodo.clase5.connection.MysqlConnection;
import ar.com.codoacodo.clase5.connection.types.DatoDeMysql;
import ar.com.codoacodo.clase5.service.DTO;
import ar.com.codoacodo.clase5.service.IService;

public class ServiceMysqlImpl implements IService {//ctrl+t

	IConnection<DatoDeMysql> connection;
	
	public ServiceMysqlImpl() {
		connection = new MysqlConnection();
	}
	
	public DTO invoke() {
		
		DatoDeMysql resp = connection.execute();//f5
		
		return new DTO(resp.getId(),resp.getNombre(),resp.getNacionalidad());
	}

}
