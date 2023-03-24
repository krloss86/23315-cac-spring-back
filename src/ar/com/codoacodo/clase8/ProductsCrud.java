package ar.com.codoacodo.clase8;

import java.time.LocalDate;

public class ProductsCrud extends BaseCrud<Products> {

	public ProductsCrud() {
		super("products");	
	}
	
	protected Products dataFromDB(String sql) {
		//extrae la data de la db!!!!
		return new Products(50l,"new product", 2500d,LocalDate.now());
	}

}
