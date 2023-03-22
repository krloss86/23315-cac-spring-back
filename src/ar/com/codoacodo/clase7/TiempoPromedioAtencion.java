package ar.com.codoacodo.clase7;

public class TiempoPromedioAtencion implements IEstadistica {

	@Override
	public Kpi generar(Turno[] turnos) {
		return new Kpi("TiempoPromedioAtencion",  "2 min");
	}

}
