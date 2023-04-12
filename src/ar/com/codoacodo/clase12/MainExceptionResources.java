package ar.com.codoacodo.clase12;

public class MainExceptionResources {

	public static void main(String[] args) {

		ManejadorDeRecurso mr = new ManejadorDeRecurso("Altas.csv");
			
		try {
			mr.lista();
		}catch(OtraException e) {
			System.out.println(e.getMessage());
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}finally {
			try {
				mr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("cerrando recurso");
		}
		
		
		try(ManejadorDeRecurso mr1 = new ManejadorDeRecurso("altas.csv")) {
			mr1.lista();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
