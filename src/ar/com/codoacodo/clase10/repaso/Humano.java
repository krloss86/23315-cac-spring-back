package ar.com.codoacodo.clase10.repaso;

public class Humano {

	protected int edad;
	protected String genero;
	//alt+shit+s
	
	public Humano(int edad, String genero) {
		if(edad < 0 || genero == null) {
			throw new IllegalArgumentException("debe indicar un idioma");
		}
		this.edad = edad;
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
