package ar.com.codoacodo.clase5.service;

public class DTO {

	private Long id;
	private String fecha;
	private String user;
	
	//alt+shit+s
	
	public DTO(Long id, String fecha, String user) {
		this.id = id;
		this.fecha = fecha;
		this.user = user;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
}
