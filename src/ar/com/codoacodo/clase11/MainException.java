package ar.com.codoacodo.clase11;
import ar.com.codoacodo.clase12.OtraException;
public class MainException {

	public static void main(String[] args) {
		/*
		Object a = "1";
		
		Integer b = (Integer)a;
		//runtime exception
		System.out.println(b);
		
		//runtime exception: NO NECESITAMOS ATRAPARLAS!!!
		if(1 / 0 > 1) {
			System.out.println("1 > 0");
		}
		*/
		
		// CHECKED EXCEPTION: DEBEN SER CONTRALADAS
		int valor = 3;
		
		int i=0;
		for(i=0;i<3;i++) {
			try {
				obtenerDatos(valor);
				break;
			}catch(MiTimeoutException e) {
				valor+= 7;
			}catch(OtraException e) {
				valor-= 2;
			}finally {
				//siempre, no importa si fue por try o por algun catch!
				System.out.println("viene siempre");
			}
		}
		if(i==3) {
			throw new IllegalArgumentException("Tardo mucho e intentamos 3 veces :(");
		}
		System.out.println("OK");
	}

	public static void obtenerDatos(int valor) throws MiTimeoutException {
		//suponemos tarda mucho y lazamos un error
		
		if(valor < 10) {
			//lanza una exception
			throw new MiTimeoutException("Tardo mucho, fijate si podes intentar de nuevo :)"); 			
		}
		if(valor < 0) {
			new OtraException("El valor en menor a 0");
		}
		
		//throw new IllegalArgumentException("Tardo mucho, fijate si podes intentar de nuevo :)");
	}
}
