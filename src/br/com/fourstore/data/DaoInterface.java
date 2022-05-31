package br.com.fourstore.data;

import java.util.List;

public interface DaoInterface<E> {
	
	void save(E e);
	
	List<E> findAll();
	
	void update(E e);
	
	void delete(E e);

}
