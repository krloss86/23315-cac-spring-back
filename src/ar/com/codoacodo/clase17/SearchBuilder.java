package ar.com.codoacodo.clase17;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import ar.com.codoacodo.clase15.maps.Turno;
import ar.com.codoacodo.clase17.ordenadores.MyComparator;
import ar.com.codoacodo.clase17.ordenadores.Nombre;

public class SearchBuilder {

	private static Map<SearchEnum, Comparator<Turno>> mapSearch = buildSearchMap();
	
	private static Map<SearchEnum, Comparator<Turno>> buildSearchMap() {
		//aca cargo todos los comparadores
		var maps = new HashMap<SearchEnum, Comparator<Turno>>();
		
		maps.put(SearchEnum.FECHA_ASC, new Comparator<Turno>() {
			public int compare(Turno o1, Turno o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}
		});

		maps.put(SearchEnum.FECHA_DES, new Comparator<Turno>() {
			public int compare(Turno o1, Turno o2) {
				return o2.getFecha().compareTo(o1.getFecha());
			}
		});
		
		maps.put(SearchEnum.EDAD, new Comparator<Turno>() {//asc
			public int compare(Turno o1, Turno o2) {
				return o1.getEdad().compareTo(o2.getEdad());
			}
		});
		/*
		maps.put(SearchEnum.NOMBRE_ASC, new Comparator<Turno>() {//asc
			public int compare(Turno o1, Turno o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		
		maps.put(SearchEnum.NOMBRE_DESC, new Comparator<Turno>() {//asc
			public int compare(Turno o1, Turno o2) {
				return o2.getNombre().compareTo(o1.getNombre());
			}
		});
		*/
		maps.put(SearchEnum.NOMBRE_DESC, new Nombre());
		maps.put(SearchEnum.NOMBRE_ASC, new Nombre());
		return maps;
	}
	
	// key -> value
	public static Comparator<Turno> getSearch(SearchEnum searchEnum) {
		
		//ver si el mapa tiene 
		if(!mapSearch.containsKey(searchEnum)) {
			throw new RuntimeException("NO existe algoritmo de ordenamiento para la clave" + searchEnum);
		}
		
		//retonar la clase que implementa Comparator<>
		if(mapSearch.get(searchEnum) instanceof MyComparator) {
			MyComparator aux = (MyComparator)mapSearch.get(searchEnum);
			aux.setSearchEnum(searchEnum);
		}
		
		return mapSearch.get(searchEnum);
	}


}
