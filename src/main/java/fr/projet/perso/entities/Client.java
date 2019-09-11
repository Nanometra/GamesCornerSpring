package fr.projet.perso.entities;

import java.util.Map;

public class Client extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient Panier panier;
	
	private String adresseLivraison;
	private String codePostal;
	private String telephone;
	
	// Historique des articles achetés (spécifique au client, il est le seul qui peut passer commande)
	private Map<Integer, Commande> historique;

	public Client() {
		super();
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Map<Integer, Commande> getHistorique() {
		return historique;
	}

	public void setHistorique(Map<Integer, Commande> historique) {
		this.historique = historique;
	}

	@Override
	public String toString() {
		return "Client [adresseLivraison=" + adresseLivraison + ", codePostal=" + codePostal + ", telephone="
				+ telephone + ", historique=" + historique + "]";
	}
}
