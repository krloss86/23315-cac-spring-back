package ar.com.codoacodo;

public class Main {

	public static void main(String[] args) {
		
		//encapsulamiento OK
		// polimorfismo ...
		
		Empleado e = new Empleado("juan", 150.0, "perez");
		
		Clasificador c = new Clasificador(e);
		
		c.clasificar(e.getSueldo());

		String clasi = c.getClasificacion();
		
		System.out.println(clasi);
	}

}
