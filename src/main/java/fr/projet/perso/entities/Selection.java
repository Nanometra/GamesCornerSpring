package fr.projet.perso.entities;

import java.io.Serializable;

public class Selection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private Article article;
	private int quantite;
	private Utilisateur utilisateur;
	private Commande commande;
	
	private transient Panier panier;

	public Selection() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	@Override
	public String toString() {
		return "Selection [id=" + id + ", article=" + article + ", quantite=" + quantite + ", utilisateur="
				+ utilisateur + ", commande=" + commande + "]";
	}
	
}
