package ar.com.codoacodo.clase9.repaso;

public class PlayStation extends Consola implements IPlay{

	private Integer version;

	public PlayStation(Integer version) {
		super("Playtation");
		this.version = version;
	}
	
	@Override
	public void play() {
		System.out.println("Jugando con " + super.nombre);
		System.out.println("version: " + this.version);
	}
}
