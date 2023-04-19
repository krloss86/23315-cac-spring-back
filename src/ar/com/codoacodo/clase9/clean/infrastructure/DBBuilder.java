package ar.com.codoacodo.clase9.clean.infrastructure;

import java.util.HashMap;
import java.util.Map;

import ar.com.codoacodo.clase9.clean.domain.PlantillaEnum;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class DBBuilder {
	
	private static Map<PlantillaEnum, PlantillaRepository> mapPlantilla = build();
	
	private static Map<PlantillaEnum, PlantillaRepository> build() {
		var plantillas = new HashMap<PlantillaEnum, PlantillaRepository>();
		plantillas.put(PlantillaEnum.DYNAMO, new DynamoDBPlantillaRepository("documento_plantilla"));
		plantillas.put(PlantillaEnum.MYSQL, new MysqlPlantillaRepository("table_plantilla"));
		plantillas.put(PlantillaEnum.TEXTO, new TextoPlantillaRepository());
		return plantillas;
	}
	
	public static PlantillaRepository buildRepository(PlantillaEnum _enum) {
		
		if(_enum == null ) {
			throw new IllegalArgumentException("Debe inidicar un enum");
		}
		
		if(!mapPlantilla.containsKey(_enum)) {
			throw new IllegalArgumentException("NO existe implementacion para el enum: " + _enum);
		}
		
		return mapPlantilla.get(_enum);
		
	}

}
