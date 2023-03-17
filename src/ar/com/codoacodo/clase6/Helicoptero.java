package ar.com.codoacodo.clase6;

public class Helicoptero extends 
	Volador implements IAterrizable{

	public Helicoptero() {
		super("Apache");		
	}
	
	public void aterrizar() {		
		System.out.println("Aterriza el avion" + super.getNombre()) ;
	}

}
