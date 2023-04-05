package ar.com.codoacodo.clase11;

public class EnumMain {

	public static void main(String[] args) {
		
		String key = "MODIFICAR";
		
		
		//existe un enum con la key
		OpcionesENUM _enum = OpcionesENUM.valueOf(key);
		
		hacer(_enum);
		
		//enums
		hacer(OpcionesENUM.ALTA);
	}
	
	public static void hacer(OpcionesENUM opcion) {
		System.out.println(opcion);
		System.out.println(opcion.getValor());
	}

}
