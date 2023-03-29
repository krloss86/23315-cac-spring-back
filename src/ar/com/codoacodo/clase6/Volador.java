package ar.com.codoacodo.clase6;

public abstract class Volador {
	
	private String nombre;
	
	public Volador(String nombre) {
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		
		return "Volador [nombre=" + nombre + "]";
	}
	
}
