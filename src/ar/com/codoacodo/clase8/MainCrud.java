package ar.com.codoacodo.clase8;

public class MainCrud {

	public static void main(String[] args) {

		//obtengo desde un html un id 
		
		var id = 1l;
		
		UsersCrud crud = new UsersCrud();
		
		User u1 = crud.getId(id);
		User u2 = crud.executeQuery();
		
		ProductsCrud userCrud = new ProductsCrud();
		Products p = userCrud.getId(50l); 
		
	}

}
