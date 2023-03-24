package ar.com.codoacodo.clase8.clean.domain;

public interface UserRepository {
	User getById(Long id);
	void save(User user);
}
