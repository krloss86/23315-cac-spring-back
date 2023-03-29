package ar.com.codoacodo.clase9.clean.application;

public class PlantillaDTO {

	private long id;
	private String textoPlantila;
	
	public PlantillaDTO(long id, String textoPlantila) {
		this.id = id;
		this.textoPlantila = textoPlantila;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTextoPlantila() {
		return textoPlantila;
	}

	public void setTextoPlantila(String textoPlantila) {
		this.textoPlantila = textoPlantila;
	}
	
}
