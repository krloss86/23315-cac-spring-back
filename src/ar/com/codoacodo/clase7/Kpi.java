package ar.com.codoacodo.clase7;

public class Kpi {

	private String nombre;
	private String valor;
	
	public Kpi(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Kpi [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
}
