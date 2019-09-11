package fr.projet.perso.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Float prixTotal;
	
	private Client client;
	private String moyenPaiement;
	private Map<Integer, Selection> listeSelections;
	
	private transient Panier panier;

	public Commande() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(String moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}

	public Map<Integer, Selection> getListeSelections() {
		return listeSelections;
	}

	public void setListeSelections(Map<Integer, Selection> listeSelections) {
		this.listeSelections = listeSelections;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", prixTotal=" + prixTotal + ", client=" + client + ", moyenPaiement="
				+ moyenPaiement + ", listeSelections=" + listeSelections + "]";
	}
	
}
