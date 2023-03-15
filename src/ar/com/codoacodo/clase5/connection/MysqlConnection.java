package ar.com.codoacodo.clase5.connection;

import ar.com.codoacodo.clase5.IConnection;
import ar.com.codoacodo.clase5.connection.types.DatoDeMysql;

public class MysqlConnection implements IConnection<DatoDeMysql>{

	//driver mysql
	
	public DatoDeMysql execute() {
		/* select id, nombre, c1,c2, n from tabla where id= <>.....*/
		// convertir los registros en un
		
		//va el dato interno! pero no el que sale del motodo
		
		DatoDeMysql registro =  new DatoDeMysql();
		
		//setter!
		
		//quiero sacar un registro DTO
		return registro;
	}

}
