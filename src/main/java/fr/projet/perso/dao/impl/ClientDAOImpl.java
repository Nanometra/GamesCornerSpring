package fr.projet.perso.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IClientDAO;
import fr.projet.perso.entities.Client;

@Repository
public class ClientDAOImpl extends AbstractDAO<Client> implements IClientDAO {

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Client clientt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Client t) {
		// TODO Auto-generated method stub
		
	}

}
