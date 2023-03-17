package ar.com.codoacodo.clase6;

public class Main {

	public static void main(String[] args) {
		/*
		byte b = -128; // - 128+ 127 
		short sh = 10;
		int in = 10;
		long lo = 10;
		float f = 10;
		double dou = 10;
		
		// byte < short < int < long < float < double
		dou = f;
		f = lo;
		lo = in;
		
		// 157.45
		f = (float)dou;
		
		//175.52
		b = (byte)157.52; //SI O NO???? //RuntimeException
		*/
		
		int[] b = new int[10];// vector de enteros [10]
		
		Avion a = new Avion("Boing");
		Helicoptero h = new Helicoptero();
		Superman s = new Superman();
		Hormiga ha = new Hormiga();
		
		Volador[] voladores = new Volador[] {a,h,s,ha};
		
		for (Volador v : voladores) {
			if(v instanceof IAterrizable) {
				IAterrizable atr = (IAterrizable)v;
				atr.aterrizar();
				System.out.println("Pista 1");
			}else {
				System.out.println("Pista 2");
			}
		}
				
	}

}
