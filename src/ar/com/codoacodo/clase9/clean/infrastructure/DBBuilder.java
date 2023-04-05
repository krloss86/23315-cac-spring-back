package ar.com.codoacodo.clase9.clean.infrastructure;

import ar.com.codoacodo.clase9.clean.domain.PlantillaEnum;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class DBBuilder {

	public static PlantillaRepository buildRepository(PlantillaEnum _enum) {
		
		if(_enum == null )
			throw new IllegalArgumentException("Debe inidicar un enum");
		
		//switch!!
		if(_enum.equals(PlantillaEnum.DYNAMO)) {
			return new DynamoDBPlantillaRepository("documento_plantilla");
		}
		if(_enum.equals(PlantillaEnum.MYSQL)) {
			return new MysqlPlantillaRepository("table_plantilla");
		}
		if(_enum.equals(PlantillaEnum.TEXTO)) {
			return new TextoPlantillaRepository();
		}
		
		throw new IllegalArgumentException("NO existe implementacion para el enum: " + _enum);
	}
}
