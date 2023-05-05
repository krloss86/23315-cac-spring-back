package ar.com.codoacodo.clase18;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		
		var list = new ArrayList<Integer>();
		
		list.add(25);
		list.add(35);
		list.add(45);
		list.add(55);
		list.add(65);
		
		var filtrados = new ArrayList<String>();
		
		//¿para filtrar los > 35
		//quiero edad:35
		for(Integer aux : list) {
			if(aux > 35) {
				filtrados.add("edad"+aux);
			}
		}
	 
		System.out.println(filtrados);
		// lambdas
		// () -> {}
		// (a) -> {..}
		// (Integer a, Integer b) -> {}
		
		//se usan en los streams
		var filtradosStream = list.stream()
			.filter(v-> v > 35)//aplico funcion intermedia
			.collect(Collectors.toList());//esta funcion terminal que obtiene una lista
		
		System.out.println(filtradosStream);
		
	}

}
