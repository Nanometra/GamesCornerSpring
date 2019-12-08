package fr.projet.perso.services;

import java.util.List;

public interface IGeneriqueService<T> {

	public T findById(Long id);
	
	public List<T> findAll();
	
	public void add(T t);
	
	public void update(T t);
	
	public void removeById(Long id);
	
}
