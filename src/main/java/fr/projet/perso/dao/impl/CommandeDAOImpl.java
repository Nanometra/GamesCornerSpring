package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ICommandeDAO;
import fr.projet.perso.entities.Commande;

@Repository
public class CommandeDAOImpl extends AbstractDAO<Commande> implements ICommandeDAO {

	public CommandeDAOImpl() {
		setClasse(Commande.class);
	}
	
	@Override
	public Commande findById(Long id) {
		return super.entityManager.find(Commande.class, id);
	}

}
