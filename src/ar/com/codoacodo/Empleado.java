package ar.com.codoacodo;

//java bean
public class Empleado {
	private String nombre;
	private Double sueldo;
	private String apellido;
	
	//alt+shift+s
	public Empleado(String nombre, Double sueldo, String apellido) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
