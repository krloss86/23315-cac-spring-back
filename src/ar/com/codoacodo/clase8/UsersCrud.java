package ar.com.codoacodo.clase8;

public class UsersCrud extends BaseCrud<User>
	implements CrudRepository{

	public UsersCrud() {
		super("users");	
	}
	
	//digo como hacer las cosas..
	protected User dataFromDB(String sql) {
		
		//simulo la conversion de datos desde los rows
		//a un objeto
		
		return new User(1l, "carlos",1500f);
	}

	public User executeQuery() {
		return new User(100l, "java lopez",15000f);
	}
}
