package fr.projet.perso.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public abstract class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int id;
	
	protected String nom;
	protected String prenom;
	protected int age;
	protected Date dateDeNaissance;
	protected String pseudo;
	protected Coordonnees coordonnees;
	protected String motDePasse;
	protected Date dateInscription;
	protected byte[] imageProfil;
	
	protected boolean actif;
	protected boolean vendeur;
	protected boolean admin;
	
	private final String FORMAT_DATE = "dd MM yyyy";
	
	public Utilisateur() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public byte[] getImageProfil() {
		return imageProfil;
	}

	public void setImageProfil(byte[] imageProfil) {
		this.imageProfil = imageProfil;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public boolean isVendeur() {
		return vendeur;
	}

	public void setVendeur(boolean vendeur) {
		this.vendeur = vendeur;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getFORMAT_DATE() {
		return FORMAT_DATE;
	}

	public int getAge() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat(FORMAT_DATE);
		
		format.format(date);
		format.format(this.dateDeNaissance);
		
		long diff = date.getTime() - this.dateDeNaissance.getTime();
		return (int) ((date.getTime() - this.dateDeNaissance.getTime()) / (24*62*62*1000));
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateDeNaissance="
				+ dateDeNaissance + ", pseudo=" + pseudo + ", coordonnees=" + coordonnees + ", motDePasse=" + motDePasse
				+ ", dateInscription=" + dateInscription + ", imageProfil=" + Arrays.toString(imageProfil) + ", actif="
				+ actif + ", vendeur=" + vendeur + ", admin=" + admin + ", FORMAT_DATE=" + FORMAT_DATE + "]";
	}
		
}
