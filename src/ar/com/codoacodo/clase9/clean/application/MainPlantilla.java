package ar.com.codoacodo.clase9.clean.application;

import ar.com.codoacodo.clase9.clean.domain.PlantillaEnum;
import ar.com.codoacodo.clase9.clean.domain.PlantillaRepository;
import ar.com.codoacodo.clase9.clean.infrastructure.DBBuilder;

public class MainPlantilla {

	public static void main(String[] args) {

		//recibo el id de la plantilla
		Long id = Long.parseLong(args[0]);//-10
		
		//variable de sistema:
		String dbImpl  = System.getProperty("NOMBRE_VARIABLE");
		
		PlantillaEnum dbNameEnum = PlantillaEnum.valueOf(dbImpl);
		
		//buscar la plantilla en la base de datos
		PlantillaRepository repository = DBBuilder.buildRepository(dbNameEnum);//caso num null
		
		//necesito un caso de uso: Application
		var useCase = new BuscarPlantilla(repository);
		
		//armo el objeto request|Command
		var cmd = new BuscarPlantillaCommand(id);
		
		//exce|invoke
		var response = useCase.exec(cmd);
		
		System.out.println(response);
	}

}
