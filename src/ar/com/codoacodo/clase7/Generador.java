package ar.com.codoacodo.clase7;

public class Generador {

	private Turno[] turnos;
	
	public Generador(Turno[] turnos) {
		if(turnos == null) {
			throw new IllegalArgumentException("Debe indicar la lista de turnos");
		}
		setTurnos(turnos);
	}
	
	private void setTurnos(Turno[] turnos) {
		this.turnos = turnos;
		
	}
	
	public Kpi[] genararEstadisticas() {

		// como genero cada estadistica?
		var listado = new EstadisticaBuilder();
			
		Kpi[] kpis = new Kpi[] {};
		//ver como resolver tema Grupo
		
		for (IEstadistica aux : listado.getListadoEstadisticas()) {
			Kpi kpi = aux.generar(turnos);
			kpis  = addToList(kpi, kpis);
		}
		return kpis;
	}
	
	private Kpi[] addToList(Kpi kpi, Kpi[] kpis) {
		Kpi[] newOne = new Kpi[kpis.length + 1]; 
		for(int i=0; i < kpis.length;i++) {
			newOne[i] = kpis[i];
		}
		newOne[kpis.length] = kpi;
		return newOne;
	}
	
}
