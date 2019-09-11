package fr.projet.perso.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public abstract class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int id;
	protected String description;
	protected Float prix;
	protected String etat;
	protected byte[] image;
	protected Float rating;
	protected Date dateSortie;
	
	protected Vendeur vendeur;
	protected List<Selection> listeSelections;

	public Article() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Vendeur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Vendeur vendeur) {
		this.vendeur = vendeur;
	}

	public List<Selection> getListeSelections() {
		return listeSelections;
	}

	public void setListeSelections(List<Selection> listeSelections) {
		this.listeSelections = listeSelections;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + ", prix=" + prix + ", etat=" + etat + ", image="
				+ Arrays.toString(image) + ", rating=" + rating + ", dateSortie=" + dateSortie + ", vendeur=" + vendeur
				+ ", listeSelections=" + listeSelections + "]";
	}	
}
