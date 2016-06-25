package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Dresseur implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDresseur;
	private String nom;
	private String prenom;
	private String adresse;
	private String specialite;
	private String mobile;
	private Session session;
	public Dresseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dresseur(String nom, String prenom, String adresse,
			String specialite, String mobile) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.specialite = specialite;
		this.mobile = mobile;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdDresseur() {
		return idDresseur;
	}
	public void setIdDresseur(int idDresseur) {
		this.idDresseur = idDresseur;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false)
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	
}
