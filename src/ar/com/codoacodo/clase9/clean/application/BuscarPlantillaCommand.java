package ar.com.codoacodo.clase9.clean.application;

//value object
public class BuscarPlantillaCommand {

	private Long id;
	
	//mas atributos | ValueObject
	public BuscarPlantillaCommand(Long id) {
		//anticorruption's layer
		if(id == null) {
			throw new IllegalArgumentException("id_null");
		}
		
		if(id < 0) {
			throw new IllegalArgumentException("id_invalid_range_negative");
		}
		
		if(id > 100000000000l) {
			throw new IllegalArgumentException("id_invalid_range_max");
		}
		
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
}
