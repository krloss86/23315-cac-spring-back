package ar.com.codoacodo.clase17.ordenadores;

import java.util.Comparator;

import ar.com.codoacodo.clase15.maps.Turno;
import ar.com.codoacodo.clase17.SearchEnum;

public class Nombre implements Comparator<Turno>,MyComparator {
	private SearchEnum searchEnum;
//	
//	public Nombre(SearchEnum searchEnum) {
//		this.searchEnum = searchEnum;
//	}

	public int compare(Turno o1, Turno o2) {
		if(searchEnum.equals(SearchEnum.NOMBRE_ASC)) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		return o2.getNombre().compareTo(o1.getNombre()); 
	}

	@Override
	public void setSearchEnum(SearchEnum searchEnum) {
		this.searchEnum = searchEnum;
	}
	
}
