package ar.com.codoacodo.clase7;

import java.time.LocalDate;

public class Turno {

	private LocalDate fechaTurno;
	private String tipo; //cambiar por ENUM
	private LocalDate fechaAtencion;
	private LocalDate fechaAbandono;
	private LocalDate fechaFinAtencion;
	
	public Turno(String tipo,LocalDate fechaTurno) {
		this.fechaTurno = fechaTurno;
		this.tipo = tipo;
	}

	/*setters*/
	public void setFechaAtencion(LocalDate fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public void setFechaAbandono(LocalDate fechaAbandono) {
		this.fechaAbandono = fechaAbandono;
	}

	public void setFechaFinAtencion(LocalDate fechaFinAtencion) {
		this.fechaFinAtencion = fechaFinAtencion;
	}

	/*getters*/
	public LocalDate getFechaTurno() {
		return fechaTurno;
	}

	public String getTipo() {
		return tipo;
	}

	public LocalDate getFechaAtencion() {
		return fechaAtencion;
	}

	public LocalDate getFechaAbandono() {
		return fechaAbandono;
	}

	public LocalDate getFechaFinAtencion() {
		return fechaFinAtencion;
	}

	@Override
	public String toString() {
		return "Turno [fechaTurno=" + fechaTurno + ", tipo=" + tipo + ", fechaAtencion=" + fechaAtencion
				+ ", fechaAbandono=" + fechaAbandono + ", fechaFinAtencion=" + fechaFinAtencion + "]";
	}
	
}
