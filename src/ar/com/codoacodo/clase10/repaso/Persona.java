package ar.com.codoacodo.clase10.repaso;

public class Persona extends Humano {

	private String nombre;
	private IIdioma idioma;
	private IIdioma[]  otrosIdiomas;
		
	public Persona(int edad, String genero, IIdioma idioma, String nombre) {
		super(edad, genero);
		if(idioma == null) {
			throw new IllegalArgumentException("debe indicar un idioma");
		}
		this.nombre = nombre;
		this.idioma  = idioma;
		this.otrosIdiomas = new IIdioma[0];
	}

	public String getNombre() {
		return nombre;
	}
	
	public void decir(String palabra) {
		this.idioma.execute(palabra);
	}
	
	public void decir(String p,IIdioma idioma) {
		if(this.hablaIdioma(idioma)) {
			idioma.execute(p);
		}else {
			//API Reflections: ver en tiempo de runtime el objeto por dentro: nombre, su clase, sus atributos etc.
			System.err.println(this.getNombre() + " no habla " + idioma.getClass().getSimpleName());
		}
	}
	
	private boolean hablaIdioma(IIdioma idioma) {
		boolean habla = false;
		if(this.idioma.getClass().equals(idioma.getClass())) {
			habla = true;
		}
		
		//ahora recorro los otros idiomas
		if(this.otrosIdiomas.length > 0) {			
			for(int i=0;!habla && i < this.otrosIdiomas.length;i++) {
				habla = this.otrosIdiomas[i].getClass().equals(idioma.getClass());
			}	
		}
		
		return habla;
	}
	
	public void aprender(IIdioma idioma) {
		//ya habla ese idioma?
		if(!this.hablaIdioma(idioma)) {
			
			//agrego a lista de otrosIdiomas
			this.add(idioma);
		}else {
			System.out.println(this.getNombre() + " ya habla " + idioma.getClass().getSimpleName());
		}
	}
	
	private void add(IIdioma idioma) {
		IIdioma[] aux = new IIdioma[this.otrosIdiomas.length + 1];
		for (int i = 0; i < this.otrosIdiomas.length; i++) {
			aux[i] = this.otrosIdiomas[i];
		}
		aux[this.otrosIdiomas.length] = idioma;
		this.otrosIdiomas = aux;
	}

	public void decirTodos(String string) {
		System.out.println("hablanod en todos los idiomas");
		this.idioma.execute(string);
		for(IIdioma aux : this.otrosIdiomas ) {
			aux.execute(string);
		}
	}
}
