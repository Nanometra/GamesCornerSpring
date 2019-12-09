package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ICoordonneesDAO;
import fr.projet.perso.entities.Coordonnees;

@Repository
public class CoordonneesDAOImpl extends AbstractDAO<Coordonnees> implements ICoordonneesDAO {

	@Override
	public Coordonnees findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coordonnees> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Coordonnees coordonnees) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Coordonnees coordonnees) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Coordonnees t) {
		// TODO Auto-generated method stub
		
	}

}
