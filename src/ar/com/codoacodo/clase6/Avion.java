package ar.com.codoacodo.clase6;

public class Avion extends 
	Volador implements IAterrizable{

	private String marca;
	
	public Avion(String marca) {
		//debe nacer primero el Volador(nombre)
		super("Avion");		
		this.marca = marca;
	}
	
	public void aterrizar() {		
		System.out.println("Aterriza el avion" + super.getNombre() + ", marca " + this.getMarca()) ;
	}

	public String getMarca() {
		return this.marca;
	}
}
