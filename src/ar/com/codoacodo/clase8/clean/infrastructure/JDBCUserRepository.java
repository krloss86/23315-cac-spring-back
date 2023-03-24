package ar.com.codoacodo.clase8.clean.infrastructure;

import ar.com.codoacodo.clase8.clean.domain.User;
import ar.com.codoacodo.clase8.clean.domain.UserRepository;

public class JDBCUserRepository implements UserRepository{
	
	@Override
	public User getById(Long id) {
		return new User(1l, "carlos", 1500f);
	}

	@Override
	public void save(User user) {
		System.out.println("saving" + user);
		
	}

}
