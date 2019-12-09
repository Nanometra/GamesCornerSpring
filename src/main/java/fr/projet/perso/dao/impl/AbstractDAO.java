package fr.projet.perso.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.projet.perso.dao.IGeneriqueDAO;

public abstract class AbstractDAO<T> implements IGeneriqueDAO<T> {
	
	private Class<T> classe;
	
	@PersistenceContext
	EntityManager entityManager;
	
	public final void setClasse(Class<T> classe) {
		this.classe = classe;
	}
	
	public T findById(long id) {
		return entityManager.find(classe, id);
	}
	
	public List<T> findAll() {
		return entityManager.createQuery("from" + classe.getName()).getResultList();
	}
	
	public void add(T t) {
		entityManager.persist(t);
	}
	
	public void update(T t) {
		entityManager.merge(t);
	}
	
	public void remove(T t) {
		entityManager.remove(t);
	}
	
	public void removeById(Long id) {
		T entite = findById(id);
		entityManager.remove(entite);
	}
	
}
