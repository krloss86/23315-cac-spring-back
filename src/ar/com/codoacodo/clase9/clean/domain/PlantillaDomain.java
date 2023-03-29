package ar.com.codoacodo.clase9.clean.domain;

import java.time.LocalDate;

public class PlantillaDomain {

	private Long id;
	private boolean habilitado;
	private String plantilla;
	private LocalDate fechaCreacion;
	private String tipo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public String getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
