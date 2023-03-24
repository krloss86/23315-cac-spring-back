package ar.com.codoacodo.clase8;

/*
 * base de todos los repositorios 
*/
public interface Repository<T> {
	public T[] findAll();
	public T getByPK(Long id);
	public void delete(Long id);
	public void save(T entity);
}
