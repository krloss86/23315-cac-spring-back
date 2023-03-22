package ar.com.codoacodo.clase7;

public class CantidadTurnosOnline implements IEstadistica {

	@Override
	public Kpi generar(Turno[] turnos) {
		return new Kpi("cantidad turnos online",  "5");
	}

}
