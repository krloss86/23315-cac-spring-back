package ar.com.codoacodo.clase8.clean.application;

import ar.com.codoacodo.clase8.clean.domain.User;
import ar.com.codoacodo.clase8.clean.domain.UserRepository;

public class CreateUser {

	private UserRepository repository;
	
	public CreateUser(UserRepository repository) {
		this.repository = repository;
	}
	
	public void exec(UserParams params) {
		
		User u = new User(1l, "bla", 14500f);
		
		this.repository.save(u);
	}
}
