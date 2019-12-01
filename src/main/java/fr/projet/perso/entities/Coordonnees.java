package fr.projet.perso.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Coordonnees implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	private String adresse;
	private int codePostal;
	private int numeroRue;
	private String numeroBatiment;
	private String numeroTelephoneMobile;
	private String numeroTelephoneFixe;
	
	@NotNull
	private String mail;
	
	public Coordonnees() {
		super();
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getNumeroBatiment() {
		return numeroBatiment;
	}

	public void setNumeroBatiment(String numeroBatiment) {
		this.numeroBatiment = numeroBatiment;
	}

	public String getNumeroTelephoneMobile() {
		return numeroTelephoneMobile;
	}

	public void setNumeroTelephoneMobile(String numeroTelephoneMobile) {
		this.numeroTelephoneMobile = numeroTelephoneMobile;
	}

	public String getNumeroTelephoneFixe() {
		return numeroTelephoneFixe;
	}

	public void setNumeroTelephoneFixe(String numeroTelephoneFixe) {
		this.numeroTelephoneFixe = numeroTelephoneFixe;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
