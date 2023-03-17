package ar.com.codoacodo.clase5.connection;

import java.io.File;

import ar.com.codoacodo.clase5.IConnection;
import ar.com.codoacodo.clase5.connection.types.DataFile;

public class FileSysteConnection implements IConnection<DataFile>{

	public DataFile execute() {
		//abro un archivo en fs
		File f = new File("c:/bla");
		
		//logica de lectura
		
		//logica de conversion
		
		DataFile registro =  new DataFile();
		
		//quiero sacar un registro DTO
		return registro;
	}

}
