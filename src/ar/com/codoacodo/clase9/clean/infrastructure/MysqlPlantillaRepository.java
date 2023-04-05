package ar.com.codoacodo.clase9.clean.infrastructure;

import java.time.LocalDate;

import ar.com.codoacodo.clase9.clean.domain.PlantillaDomain;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class MysqlPlantillaRepository implements PlantillaRepository {

	private String tableName;
	
	public MysqlPlantillaRepository(String tableName) {
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
		
		//me contecto a la base o busco en el servicio tal o parseo un archivo
		var plantilla = new PlantillaDomain(1l, "aviso");
		plantilla.setFechaCreacion(LocalDate.now());
		plantilla.setHabilitado(true);
		
		return plantilla;
	}
	
}
