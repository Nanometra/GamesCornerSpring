package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.IVendeurDAO;
import fr.projet.perso.entities.Vendeur;
import fr.projet.perso.services.IVendeurService;

@Service
public class VendeurServiceImpl implements IVendeurService {

	@Autowired
	private IVendeurDAO vendeurDao;
	
	@Override
	@Transactional
	public Vendeur findById(Long id) {
		return vendeurDao.findById(id);
	}

	@Override
	@Transactional
	public List<Vendeur> findAll() {
		return vendeurDao.findAll();
	}

	@Override
	@Transactional
	public void add(Vendeur vendeur) {
		vendeurDao.add(vendeur);
	}

	@Override
	@Transactional
	public void update(Vendeur vendeur) {
		vendeurDao.update(vendeur);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		vendeurDao.removeById(id);
	}

}
