package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.ICommandeDAO;
import fr.projet.perso.entities.Commande;
import fr.projet.perso.services.ICommandeService;

@Service
public class CommandeServiceImpl implements ICommandeService {

	@Autowired
	private ICommandeDAO commandeDao;
	
	@Override
	@Transactional
	public Commande findById(Long id) {
		return commandeDao.findById(id);
	}

	@Override
	@Transactional
	public List<Commande> findAll() {
		return commandeDao.findAll();
	}

	@Override
	@Transactional
	public void add(Commande commande) {
		commandeDao.add(commande);
	}

	@Override
	@Transactional
	public void update(Commande commande) {
		commandeDao.update(commande);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		commandeDao.removeById(id);
	}

}
