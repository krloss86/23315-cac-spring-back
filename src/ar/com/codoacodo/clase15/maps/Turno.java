package ar.com.codoacodo.clase15.maps;

import java.time.LocalDateTime;

public class Turno implements Comparable<Turno>{

	private LocalDateTime fecha;
	private String nombre;
	private boolean prioridad;
	private LocalDateTime fechaFin;
	private Integer edad;
	
	public Turno(String nombre, boolean prioridad) {
		this.fecha = LocalDateTime.now();
		this.nombre = nombre;
		this.prioridad = prioridad;
	}
	public Turno(LocalDateTime fecha, String nombre, boolean prioridad) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.prioridad = prioridad;
	}
	public Turno(LocalDateTime fecha, String nombre, boolean prioridad,Integer edad) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.prioridad = prioridad;
		this.edad = edad;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isPrioridad() {
		return prioridad;
	}
	public void setPrioridad(boolean prioridad) {
		this.prioridad = prioridad;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String toString() {
		return "Turno [fecha=" + fecha + ", nombre=" + nombre + ", prioridad=" + prioridad + ", fechaFin=" + fechaFin
				+ ", edad=" + edad + "]";
	}
	//ALT+SHIT+S
	//[3,5]
	/*
	 * < 0 
	 * 0
	 * > 0
	 **/
	public int compareTo(Turno o) {
		//return this.fecha.compareTo(o.getFecha());
		int cmp = o.getFecha().compareTo(this.getFecha()); // < 0 ó > 0
		if(cmp != 0) {
			return cmp;
		}
		
		if(o.isPrioridad() && this.isPrioridad()) {
			return 0;
		}
		if(o.isPrioridad()) {
			return 1;
		}
		return -1;
	}
	public Integer getEdad() {
		return edad;
	}
	
	
}
