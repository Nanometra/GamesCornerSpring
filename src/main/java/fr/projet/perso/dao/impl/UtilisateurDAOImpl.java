package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IUtilisateurDAO;
import fr.projet.perso.entities.Utilisateur;

@Repository
public class UtilisateurDAOImpl extends AbstractDAO<Utilisateur> implements IUtilisateurDAO {

	@Override
	public Utilisateur findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Utilisateur t) {
		// TODO Auto-generated method stub
		
	}

}
