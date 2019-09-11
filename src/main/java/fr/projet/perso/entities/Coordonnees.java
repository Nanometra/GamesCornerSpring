package fr.projet.perso.beans;

public class Coordonnees {

	private String adresse;
	private int codePostal;
	private int numeroRue;
	private String numeroBatiment;
	private String numeroTelephoneMobile;
	private String numeroTelephoneFixe;
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
