package fr.projet.perso.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Type;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminant", discriminatorType = DiscriminatorType.STRING)
public abstract class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@NotNull(message = "Veuillez saisir un nom")
	protected String nom;

	protected String prenom;
	protected int age;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateDeNaissance;
	protected String pseudo;

	@OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	protected Coordonnees coordonnees;

	@NotNull(message = "Veuillez entrer un mot de passe")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[-+!*$@%_])([-+!*$@%_\\w]{8,15})$")
	protected String motDePasse;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(unique = true, nullable = false)
	protected Date dateInscription;

	@Lob
	@Type(type = "org.hibernate.type.BinaryType")
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
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
		return (int) ((date.getTime() - this.dateDeNaissance.getTime()) / (24 * 62 * 62 * 1000));
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateDeNaissance="
				+ dateDeNaissance + ", pseudo=" + pseudo + ", coordonnees=" + coordonnees + ", motDePasse=" + motDePasse
				+ ", dateInscription=" + dateInscription + ", imageProfil=" + Arrays.toString(imageProfil) + ", actif="
				+ actif + ", vendeur=" + vendeur + ", admin=" + admin + ", FORMAT_DATE=" + FORMAT_DATE + "]";
	}

}
