package ar.com.codoacodo.clase14.collections;

import java.util.HashMap;
import java.util.Map;

import ar.com.codoacodo.clase10.repaso.Chino;
import ar.com.codoacodo.clase10.repaso.Espanol;
import ar.com.codoacodo.clase10.repaso.IIdioma;
import ar.com.codoacodo.clase10.repaso.Ingles;

public class MapMain {

	public static void main(String[] args) {

		//crear un mapa!!!!
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("lunes", 1);
		mapa.put("martes", 2);
		mapa.put("miercoles", 3);
		mapa.put("jueves", 4);
		mapa.put("viernes", 5);
		mapa.put("sabado", 6);
		mapa.put("domingo", 7);
		
		var mapa2 = new HashMap<String,String>();
		mapa2.put("LUNES", "T1");
		mapa2.put("MARTES", "T1");
		mapa2.put("MIERCOLES", "T1");
		mapa2.put("MIERCOLES", "T2");
		
		var mapa3 = new HashMap<String,IIdioma>();
		mapa3.put("espanol", new Espanol());
		mapa3.put("ingles", new Ingles());
		mapa3.put("chino", new Chino());
		
		var mapa4 = new HashMap<String,IIdioma>();
		
	}

}
