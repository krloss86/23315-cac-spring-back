package ar.com.codoacodo.clase3;

public class MySqlSearch implements ISearch{

	public Articulo[] search() {
		// JDBC
		// Connection, PreparedStatement, ResultSet
		/*simular una consulta a la db*/
		System.out.println("Select * from tabla where...");
		
		Articulo a1 = new Articulo(1l,"IRON MAN AVENGER ENDGAME",22052.01d,"","");
		Articulo a2 = new Articulo(1l,"MARVEN STUDIO EL DICCION...",8383.95D,"BRAY, ADAM","http://bla...");
		Articulo a3 = new Articulo(1l,"NUNCA CORRI SIEMPRE COBRÉ...",4290D,"BRAY, ADAM","http://bla...");
		
		return new Articulo[] {a1,a2,a3};
	}
}
