package ar.com.codoacodo.clase15.maps;

public class Usuario {
	private int id;
	private String nombre;
	private CargaEnum cargo;
	public Usuario(int i, String nombre, CargaEnum cargo) {
		this.id = i;
		this.nombre = nombre;
		this.cargo = cargo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CargaEnum getCargo() {
		return cargo;
	}
	public void setCargo(CargaEnum cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", cargo=" + cargo + "]";
	}
	
	

}
