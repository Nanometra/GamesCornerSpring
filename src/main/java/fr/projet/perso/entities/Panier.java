package fr.projet.perso.entities;

import java.io.Serializable;
import java.util.List;

public class Panier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float prixTotal;
	private List<Selection> listeSelections;
	private Client client;
	private Commande commande;
	private boolean validerPanier;
	
	public Panier() {
		super();
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public List<Selection> getListeSelections() {
		return listeSelections;
	}

	public void setListeSelections(List<Selection> listeSelections) {
		this.listeSelections = listeSelections;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public boolean isValiderPanier() {
		return validerPanier;
	}

	public void setValiderPanier(boolean validerPanier) {
		this.validerPanier = validerPanier;
	}

	@Override
	public String toString() {
		return "Panier [prixTotal=" + prixTotal + ", listeSelections=" + listeSelections + ", client=" + client
				+ ", commande=" + commande + ", validerPanier=" + validerPanier + "]";
	}	
	
}
