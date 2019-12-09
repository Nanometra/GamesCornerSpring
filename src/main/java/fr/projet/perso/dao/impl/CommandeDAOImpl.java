package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ICommandeDAO;
import fr.projet.perso.entities.Commande;

@Repository
public class CommandeDAOImpl extends AbstractDAO<Commande> implements ICommandeDAO {

	@Override
	public Commande findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Commande commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Commande commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Commande t) {
		// TODO Auto-generated method stub
		
	}

}
