package ar.com.codoacodo.clase9.repaso;

public class XboxStation extends Consola implements IPlay{

	private Integer version;
	private String forma;

	public XboxStation(Integer version,String forma) {
		super("Xbox");
		this.version = version;
		this.forma = forma;
	}

	@Override
	public void play() {
		System.out.println("Jugando con " + super.nombre);
		System.out.println("version: " + this.version);
		System.out.println("forma: " + this.forma); 
	}
	
}
