package ar.com.codoacodo.clase9.clean.domain;

public enum PlantillaEnum {

	MYSQL("mysql"),
	DYNAMO("dynamo"),
	TEXTO("texto")
	;
	private String value;
	
	private PlantillaEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
