package ar.com.codoacodo.clase7;

public class Grupo {
	
	private String nombre;
	private Kpi[] valores;
	
	public Grupo(String nombre, Kpi[] valores) {
			this.nombre = nombre;
		this.valores = valores;
	}

	public String getNombre() {
		return nombre;
	}

	public Kpi[] getValores() {
		return valores;
	}
	
}
