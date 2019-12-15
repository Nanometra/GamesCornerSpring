package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ICoordonneesDAO;
import fr.projet.perso.entities.Coordonnees;

@Repository
public class CoordonneesDAOImpl extends AbstractDAO<Coordonnees> implements ICoordonneesDAO {

	public CoordonneesDAOImpl() {
		setClasse(Coordonnees.class);
	}
	
	@Override
	public Coordonnees findById(Long id) {
		return super.entityManager.find(Coordonnees.class, id);
	}
	
}
