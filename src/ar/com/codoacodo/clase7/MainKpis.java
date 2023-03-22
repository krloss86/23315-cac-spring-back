package ar.com.codoacodo.clase7;

import java.time.LocalDate;
import java.util.Arrays;

public class MainKpis {

	public static void main(String[] args) {
		
		Turno[] turnos = new Turno[2];
		turnos[0] = new Turno("caja",LocalDate.now());
		turnos[1] = new Turno("oficial",LocalDate.now().plusDays(1));
		
		//crear mas turnos!!!
		
		var generador = new Generador(turnos);
		
		Kpi[] kpis = generador.genararEstadisticas();
		
		System.out.println("enviando al front...");
		
		System.out.println(Arrays.toString(kpis));
	}

}
