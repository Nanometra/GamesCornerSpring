package fr.projet.perso.dao;

import java.util.List;

public interface IGeneriqueDAO<T> {
	
	public T findById(Long id);
	
	public List<T> findAll();
	
	public void add(T t);
	
	public void update(T t);
	
	public void remove(T t);
	
	public void removeById(Long id);
	
}
