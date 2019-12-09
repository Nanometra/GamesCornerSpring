package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IVendeurDAO;
import fr.projet.perso.entities.Vendeur;

@Repository
public class VendeurDAOImpl extends AbstractDAO<Vendeur> implements IVendeurDAO {

	@Override
	public Vendeur findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendeur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Vendeur vendeur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Vendeur vendeur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Vendeur t) {
		// TODO Auto-generated method stub
		
	}

}
