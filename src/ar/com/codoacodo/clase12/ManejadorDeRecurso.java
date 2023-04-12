package ar.com.codoacodo.clase12;

public class ManejadorDeRecurso implements AutoCloseable{

	private String nombre;
	
	public ManejadorDeRecurso(String nombre) {
		this.nombre = nombre;
	}

	public void lista() throws OtraException {
		if(this.nombre.charAt(0) == 'A') {
			throw new OtraException("Error listando " + this.nombre);
		}
		
		//hace algo!!!
		if(this.nombre.indexOf('t') > 0) {
			throw new OtraException("Error listando " + this.nombre, new Exception("Exception interna"));
		}
		
		System.out.println("listando " + this.nombre);
	}
	
	public void close() throws Exception {
		System.out.println("cerrando" + this.nombre);
	}

}
