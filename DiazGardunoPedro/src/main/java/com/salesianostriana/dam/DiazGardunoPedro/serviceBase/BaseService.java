package com.salesianostriana.dam.DiazGardunoPedro.serviceBase;

import java.util.List;
import java.util.Optional;

public interface BaseService <T, ID> {
	
	T save(T t);
	
	Optional<T>  findById(ID id);
	
	List<T> findAll();
	
	T edit(T t);
	
	void delete(T t);
	
	void deleteById(ID id);

}
