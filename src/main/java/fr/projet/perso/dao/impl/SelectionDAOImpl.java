package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ISelectionDAO;
import fr.projet.perso.entities.Selection;

@Repository
public class SelectionDAOImpl extends AbstractDAO<Selection> implements ISelectionDAO {

	@Override
	public Selection findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Selection> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Selection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Selection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Selection t) {
		// TODO Auto-generated method stub
		
	}

}
