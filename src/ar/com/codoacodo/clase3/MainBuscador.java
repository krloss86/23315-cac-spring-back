package ar.com.codoacodo.clase3;

public class MainBuscador {

	public static void main(String[] args) {

		String claveEnviadaPorElFrontend = "iron man";

		//decidir que implementacion usa... en base a una variable de entorno
		var env = args[0];//MYSQL | MONGO
		
		ISearch searchService = SearchFactory.getSearch(env);
		
		//1 - instanciar un buscador
		Buscador buscador = new Buscador(searchService);//fija el tipo de datos
		
		//2 - set de la clave
		buscador.setClave(claveEnviadaPorElFrontend);
		
		//3 - invoco el metodo buscar
		buscador.buscar();
		
		
		Articulo[] resultados = buscador.getLitado();
		if(resultados.length == 0) {
			System.out.println("No hay datos");
			System.exit(0);
		}

		//aca si hay datos 
		//simula la parte grafica 
		// con un for
		// por consola
		System.out.println("Hemos Encontrado "+buscador.getCantidad()+" Resultados Para '" +claveEnviadaPorElFrontend+ "'");
		for(var articulo : resultados) {
			System.out.println(articulo);
		}
		
	}

}
