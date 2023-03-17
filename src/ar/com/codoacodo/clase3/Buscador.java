package ar.com.codoacodo.clase3;

public class Buscador {

	//atributos
	private String clave;
	private Articulo[] listado;  
	private int cantidad;
		
	private ISearch searchService;
	
	//inyectar desde afuera la instancia concreta
		
	//constructo/res
	public Buscador(ISearch search) {
		this.searchService = search;
	}
	
	public Buscador(String clave) {
		setClave(clave);
	}
	
	public void setSearchService(ISearch searchService) {
		this.searchService = searchService;
	}
		
	//metodos
	public void buscar() {
		
		this.setListado(this.searchService.search());
		
		this.setCantidad(getLitado().length);
	}

	public Articulo[] getLitado() {
		if(this.listado == null) {
			this.setListado(new Articulo[0]);
		}
		// quiero escribir codigo
		return this.listado;
	}
	
	public int getCantidad(){
		return this.cantidad;
	}
	
	private void setListado(Articulo[] articulos) {
		this.listado = articulos;
	}
	
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setClave(String clave) {
		if(clave == null || clave.isBlank()) {
			this.clave = "";
		}
		this.clave = clave;
	}
}
