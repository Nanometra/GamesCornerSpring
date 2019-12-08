package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.ICoordonneesDAO;
import fr.projet.perso.entities.Coordonnees;
import fr.projet.perso.services.ICoordonneesService;

@Service
public class CoordonneesServiceImpl implements ICoordonneesService {

	@Autowired
	private ICoordonneesDAO coordonneesDao;
	
	@Override
	@Transactional
	public Coordonnees findById(Long id) {
		return coordonneesDao.findById(id);
	}

	@Override
	@Transactional
	public List<Coordonnees> findAll() {
		return coordonneesDao.findAll();
	}

	@Override
	@Transactional
	public void add(Coordonnees coordonnees) {
		coordonneesDao.add(coordonnees);
	}

	@Override
	@Transactional
	public void update(Coordonnees coordonnees) {
		coordonneesDao.update(coordonnees);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		coordonneesDao.removeById(id);
	}

}
