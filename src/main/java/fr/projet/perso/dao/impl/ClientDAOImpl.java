package fr.projet.perso.dao.impl;

import org.springframework.stereotype.Repository;

import fr.projet.perso.dao.IClientDAO;
import fr.projet.perso.entities.Client;

@Repository
public class ClientDAOImpl extends AbstractDAO<Client> implements IClientDAO {

	public ClientDAOImpl() {
		setClasse(Client.class);
	}
	
	@Override
	public Client findById(Long id) {
		return super.entityManager.find(Client.class, id);
	}

	

}
