package ar.com.codoacodo.clase6;

public class Hormiga extends Volador {
	
	public Hormiga() {
		super("Hormiga Atomica");
	}
	
	public void aterrizar() {		
		System.out.println("Aterriza el hormiga" + super.getNombre()) ;
	}
}
