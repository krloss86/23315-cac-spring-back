package ar.com.codoacodo.clase9.clean.infrastructure;

import ar.com.codoacodo.clase9.clean.domain.PlantillaDomain;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class TextoPlantillaRepository implements PlantillaRepository {

	private String filaPath = "";
	
	@Override
	public PlantillaDomain getById(Long id) {
		
		return new PlantillaDomain(1l,"plantilla xyz"); 
	}

}
