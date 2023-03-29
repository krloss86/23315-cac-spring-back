package ar.com.codoacodo.clase9.clean.infrastructure;

import ar.com.codoacodo.clase9.clean.domain.PlantillaDomain;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class DynamoDBPlantillaRepository implements PlantillaRepository {

	private String tableName;
	private String otroParametro;
	private String algoMas;
	
	public DynamoDBPlantillaRepository(String tableName) {
		if(tableName == null) {
			throw new IllegalArgumentException("Debe indicar el nombre de la tabla");
		}
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}
	
	@Override
	public PlantillaDomain getById(Long id) {
		
		return null;
	}
}
