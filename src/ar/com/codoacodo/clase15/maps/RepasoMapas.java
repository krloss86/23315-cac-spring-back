package ar.com.codoacodo.clase15.maps;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RepasoMapas {

	public static void main(String[] args) {
		int MAX = 3;
		Scanner teclado = new Scanner(System.in);
		
		var turnos = new PriorityQueue<Turno>();
		
		System.out.println("Va llegando gente a la fila");
		
		LocalDateTime ldt = LocalDateTime.now();
		
		for(int i=0;i<MAX;i++) {
			System.out.println("Prioritario?");
			boolean prioridad = teclado.nextInt() == 1;
			
			System.out.println("Nombre:");
			String nomrbe = teclado.next();
			
			turnos.add(new Turno(ldt, nomrbe,prioridad));
		}
		teclado.close();
		
//		[juan,maria, elenena]
				
		//llamar a los turnos
		while(!turnos.isEmpty()) {
			//saco el primero de la cola
			var next = turnos.poll();
			System.out.println("usuario atendido:" + next);
			next.setFechaFin(LocalDateTime.now());
		}
		
		System.out.println("No hay mas turnos!");
	}
}
