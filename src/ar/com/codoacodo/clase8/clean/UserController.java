package ar.com.codoacodo.clase8.clean;

import ar.com.codoacodo.clase8.clean.application.CreateUser;
import ar.com.codoacodo.clase8.clean.application.UserParams;
import ar.com.codoacodo.clase8.clean.infrastructure.JDBCUserRepository;

public class UserController {

	public static void main(String[] args) {
		
		Long id = 1l;//viene de un html		
		
		var repository = new JDBCUserRepository();	
		
		CreateUser cu = new CreateUser(repository);
		
		var userParams = new UserParams(id);
		
		cu.exec(userParams);
	}

}
