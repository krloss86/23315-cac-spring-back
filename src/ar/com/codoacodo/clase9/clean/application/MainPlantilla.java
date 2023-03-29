package ar.com.codoacodo.clase9.clean.application;

import ar.com.codoacodo.clase9.clean.infrastructure.DynamoDBPlantillaRepository;

public class MainPlantilla {

	public static void main(String[] args) {

		//recibo el id de la plantilla
		Long id = Long.parseLong(args[0]);//-10
		
		//buscar la plantilla en la base de datos
		var repository = new DynamoDBPlantillaRepository("documento_plantilla");
		
		//necesito un caso de uso: Application
		var useCase = new BuscarPlantilla(repository);
		
		//armo el objeto request|Command
		var cmd = new BuscarPlantillaCommand(id);
		
		//exce|invoke
		var response = useCase.exec(cmd);
		
		System.out.println(response);
	}

}
