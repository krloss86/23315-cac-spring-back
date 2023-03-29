package ar.com.codoacodo.clase6;

public class Superman extends Volador implements IAterrizable {

	public Superman() {
		super("Clark Ken");
	}

	public void aterrizar() {
		System.out.println("Aterriza Clark Ken" + super.getNombre());
	}

}