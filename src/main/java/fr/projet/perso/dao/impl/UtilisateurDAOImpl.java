package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IUtilisateurDAO;
import fr.projet.perso.entities.Utilisateur;

@Repository
public class UtilisateurDAOImpl extends AbstractDAO<Utilisateur> implements IUtilisateurDAO {

	public UtilisateurDAOImpl() {
		setClasse(Utilisateur.class);
	}
	
	@Override
	public Utilisateur findById(Long id) {
		return super.entityManager.find(Utilisateur.class, id);
	}

}
