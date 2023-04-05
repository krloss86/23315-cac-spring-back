package ar.com.codoacodo.clase11;

public enum OpcionesENUM {
	ALTA("alta"),
	BAJA("baja"),
	MODIFICAR("modificar"),
	ELIMINAR("eliminar")
	;
	
	private String valor; 
	
	private OpcionesENUM(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}
}
