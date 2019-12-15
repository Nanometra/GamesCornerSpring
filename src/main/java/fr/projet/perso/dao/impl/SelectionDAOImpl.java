package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.ISelectionDAO;
import fr.projet.perso.entities.Selection;

@Repository
public class SelectionDAOImpl extends AbstractDAO<Selection> implements ISelectionDAO {

	public SelectionDAOImpl() {
		setClasse(Selection.class);
	}

	@Override
	public Selection findById(Long id) {
		return super.entityManager.find(Selection.class, id);
	}
	
}
