package fr.projet.perso.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.projet.perso.dao.IClientDAO;
import fr.projet.perso.entities.Client;
import fr.projet.perso.services.IClientService;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDAO clientDAO;

	@Override
	@Transactional
	public Client findById(Long id) {
		return clientDAO.findById(id);
	}

	@Override
	@Transactional
	public List<Client> findAll() {
		return clientDAO.findAll();
	}

	@Override
	@Transactional
	public void add(Client client) {
		clientDAO.add(client);
	}

	@Override
	@Transactional
	public void update(Client client) {
		clientDAO.update(client);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		clientDAO.removeById(id);
	}

}
