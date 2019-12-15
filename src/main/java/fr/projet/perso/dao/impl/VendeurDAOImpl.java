package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IVendeurDAO;
import fr.projet.perso.entities.Vendeur;

@Repository
public class VendeurDAOImpl extends AbstractDAO<Vendeur> implements IVendeurDAO {

	public VendeurDAOImpl() {
		setClasse(Vendeur.class);
	}
	
	@Override
	public Vendeur findById(Long id) {
		return super.entityManager.find(Vendeur.class, id);
	}

}
