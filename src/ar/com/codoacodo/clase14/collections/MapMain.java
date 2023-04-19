package ar.com.codoacodo.clase14.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import ar.com.codoacodo.clase10.repaso.Chino;
import ar.com.codoacodo.clase10.repaso.Espanol;
import ar.com.codoacodo.clase10.repaso.IIdioma;
import ar.com.codoacodo.clase10.repaso.IdiomaEnum;
import ar.com.codoacodo.clase10.repaso.Ingles;

public class MapMain {

	public static void main(String[] args) {

		var mapa4 = new LinkedHashMap<IdiomaEnum,IIdioma>();
		mapa4.put(IdiomaEnum.INGLES, new Ingles());
		mapa4.put(IdiomaEnum.ESPANOL, new Espanol());
		mapa4.put(IdiomaEnum.CHINO, new Chino());
		
		//recorrer de otra forma el mapa: Set<Entry<K,V>>
		var entries = mapa4.entrySet();
		for(Entry<IdiomaEnum,IIdioma> entry : entries) {
			entry.getValue().execute(entry.getKey().toString());//IIdioma
		}
		
		//remove
		mapa4.remove(IdiomaEnum.CHINO);
		System.out.println(mapa4.keySet());
		
		//linkedlist
		//queue
		//> priorityqueue
		// comporators/comparable
		//treeset
	}
}
