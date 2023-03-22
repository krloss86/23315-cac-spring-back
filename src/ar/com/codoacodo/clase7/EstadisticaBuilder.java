package ar.com.codoacodo.clase7;

public class EstadisticaBuilder {

	private IEstadistica[] listadoEstadisticas;
	
	public EstadisticaBuilder()  {
		
		//tiempo promerdio de atencion,
		//SALIR DE UNA BASE DATOS DE CONFIGURACION
		
		var a = new TiempoPromedioAtencion();
		var b = new CantidadTurnosOnline();
		var c = new CantidadTurnosAbandonados();
		
		listadoEstadisticas = new IEstadistica[] {a,b,c};
	}
	
	public IEstadistica[] getListadoEstadisticas() {
		return this.listadoEstadisticas;
	}

}
