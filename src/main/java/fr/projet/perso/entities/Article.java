package fr.projet.perso.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String description;
	protected Float prix;
	protected String etat;
	protected byte[] image;
	protected Float rating;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateSortie;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendeur_id")
	protected Vendeur vendeur;
	
	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
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
