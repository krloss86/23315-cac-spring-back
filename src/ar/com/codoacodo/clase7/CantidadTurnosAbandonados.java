package ar.com.codoacodo.clase7;

public class CantidadTurnosAbandonados implements IEstadistica {

	@Override
	public Kpi generar(Turno[] turnos) {
		return new Kpi("cantidad turnos abandonados",  "10");
	}

}
