package ar.com.codoacodo.clase8;

public abstract class BaseCrud<T> {

	protected String tableName;
	
	public BaseCrud(String tableName) {
		if(tableName == null || tableName.isBlank()) {
			throw new IllegalArgumentException("Debe indicar la tabla");
		}
		this.tableName = tableName;
	}
	
	public final T getId(Long id) {
		String sql = "select * from " + this.tableName + " where id = " + id;
		//c1,c2,...cn
		//d1,d2,...dn
		
		//delego en el hijo que sabe construir los
		//datos desde la base de datos
		T res = this.dataFromDB(sql);
		
		System.out.println("T from data" + res);
		
		return res;
	}

	//cada hijo dice como convierte los datos
	//de la base a objetos
	protected abstract T dataFromDB(String sql);
}
