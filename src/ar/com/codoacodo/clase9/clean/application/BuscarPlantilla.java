package ar.com.codoacodo.clase9.clean.application;

import ar.com.codoacodo.clase9.clean.domain.PlantillaDomain;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;

public class BuscarPlantilla {

	private PlantillaRepository repository;
	
	public BuscarPlantilla(PlantillaRepository repository) {
		if(repository == null) {
			//exception!!!
		}
		this.repository = repository;
	}

	public PlantillaDTO exec(BuscarPlantillaCommand cmd) {
		
		//buscado el dato en la db por medio del repository
		PlantillaDomain plantillaDomain = this.repository.getById(cmd.getId());
		
		//en base el objeto de dominio, construyo el dto de salida
		
		return new PlantillaDTO(plantillaDomain.getId(), plantillaDomain.getPlantilla());
	}
}
