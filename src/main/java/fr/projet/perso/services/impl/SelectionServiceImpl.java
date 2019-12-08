package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.ISelectionDAO;
import fr.projet.perso.entities.Selection;
import fr.projet.perso.services.ISelectionService;

@Service
public class SelectionServiceImpl implements ISelectionService {
	
	@Autowired
	private ISelectionDAO selectionDao;

	@Override
	@Transactional
	public Selection findById(Long id) {
		return selectionDao.findById(id);
	}

	@Override
	@Transactional
	public List<Selection> findAll() {
		return selectionDao.findAll();
	}

	@Override
	@Transactional
	public void add(Selection selection) {
		selectionDao.add(selection);
	}

	@Override
	@Transactional
	public void update(Selection selection) {
		selectionDao.update(selection);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		selectionDao.removeById(id);
	}

}
