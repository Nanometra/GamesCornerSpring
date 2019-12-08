package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.IUtilisateurDAO;
import fr.projet.perso.entities.Utilisateur;
import fr.projet.perso.services.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {
	
	@Autowired
	private IUtilisateurDAO utilisateurDao;

	@Override
	@Transactional
	public Utilisateur findById(Long id) {
		return utilisateurDao.findById(id);
	}

	@Override
	@Transactional
	public List<Utilisateur> findAll() {
		return utilisateurDao.findAll();
	}

	@Override
	@Transactional
	public void add(Utilisateur utilisateur) {
		utilisateurDao.add(utilisateur);
	}

	@Override
	@Transactional
	public void update(Utilisateur utilisateur) {
		utilisateurDao.update(utilisateur);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		utilisateurDao.removeById(id);
	}

}
