package ar.com.codoacodo.clase12.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MainCollections {

	public static void main(String[] args) {
		
		//crear una Collection > List > ArrayList
		ArrayList<Integer> edades = new ArrayList<>();
		
		List<Integer> e2 = new ArrayList<>(); 

		Collection<Integer> e3 = new ArrayList<>();
		
		//modo de uso
		edades.add(10);//0
		edades.add(20);
		edades.add(20);
		edades.add(20);
		edades.add(20);
		edades.add(30);
		edades.add(40);
		
		System.out.println(edades);
		
		//tamaño
		System.out.println(edades.size());
		
		//vacio?
		System.out.println(edades.isEmpty()); //boolean
		
		System.out.println(edades.contains(50)); //boolean
		
		edades.remove(2);
		System.out.println(edades);//10 20 40
		
		//limpio
		//edades.clear();
		
		System.out.println(edades);//[]
		
		int idx = edades.indexOf(40);
		System.out.println("idx de 40: " + idx);
		
		//obtengo el objeto 
		Integer objeto = edades.get(idx);
		System.out.println(objeto);
		
		edades.set(idx, 100);
		objeto = edades.get(idx);
		System.out.println(objeto);
		
		System.out.println(edades);
		
		//Itertator
		/*for(Integer aux : edades) {
			if(aux == 20) {
				edades.remove(aux);
			}
		}*/
		Iterator<Integer> itEdades = edades.iterator();
		while(itEdades.hasNext()) {
			Integer el = itEdades.next();
			if(el == 20) {
				itEdades.remove();
			}
		}
		
		System.out.println("--------------------------------------");
	
		e2 = List.of(200,300,400,500);
		
		System.out.println(e2);
		
//		e2.add(600);
		
		System.out.println(e2);
		
	}

}
