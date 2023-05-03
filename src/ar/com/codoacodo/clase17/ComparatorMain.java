package ar.com.codoacodo.clase17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import ar.com.codoacodo.clase15.maps.Turno;

public class ComparatorMain {

	public static void main(String[] args) {

		var turnos = new PriorityQueue<Turno>();
		
		turnos.add(new Turno(LocalDateTime.now(), "carlos",false,25));
		turnos.add(new Turno(LocalDateTime.now().plus(Period.ofDays(1)), "maria",false,26));
		turnos.add(new Turno(LocalDateTime.now().plus(Period.ofDays(2)), "pedro",false,18));
		
		Iterator<Turno> itTurno = turnos.iterator();
		while(itTurno.hasNext()) {
			System.out.println(itTurno.next());
		}
		
		String claveDeOrden = "NOMBRE_ASC";//viene de algun lugar
			
		//orden externo! 
		//cambiar el orden
		Comparator<Turno> ordenExterno = SearchBuilder.getSearch(SearchEnum.valueOf(claveDeOrden));//crtl+shift+i 
				
		List<Turno> aux = new ArrayList<Turno>(turnos);		
		Collections.sort(aux, ordenExterno);
		
		System.out.println("-------------------------------------");
		itTurno = aux.iterator();
		while(itTurno.hasNext()) {
			System.out.println(itTurno.next());
		}
	}

}
