package ar.com.codoacodo;

public class Clasificador {

	private String clasificacion; //? encapsulamiento

	private Empleado empl;
	
	public Clasificador(Empleado empl) {
		if(empl == null) {
			throw new IllegalArgumentException("Debe indicar un Empleado");
		}
		this.empl = empl;
	}
	
	public void clasificar() {
		if(this.empl.getSueldo() > 100) {
			this.clasificacion = "RENTABLE";
		}else {
			this.clasificacion = "AGRO";
		}	
	}
	public void clasificar(Double sueldo) {
		if(sueldo > 100) {
			this.clasificacion = "RENTABLE";
		}else {
			this.clasificacion = "AGRO";
		}	
	}
	
	public String getClasificacion() {
		//negocio
		if(this.clasificacion == null) {
			throw new IllegalArgumentException("Debe clasificar al empleado primero");
		}
		return this.clasificacion;
	}
	
	public String getClasificacion(Empleado e) {
		//negocio
		if(e == null) {
			throw new IllegalArgumentException("Debe indicar un Empleado");
		}
		
		//clasificar
		this.clasificar(e.getSueldo());
		
		return this.clasificacion;
	}
}
