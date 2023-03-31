package ar.com.codoacodo.clase10.repaso;

public class MainIdioma {

	public static void main(String[] args) {
		
		IIdioma idioma = new Espanol();
		
		Persona p = new Persona(37,"Masculino",idioma,"carlos");

		idioma = new Ingles();
		
		p.aprender(idioma);
		
		idioma = new Chino();
		
		p.aprender(idioma);
		p.aprender(idioma);

		p.decirTodos("hola");
	}

}
