package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Session implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idSession;
	private String login;
	private String password;
	private String role;
	private String mobile;
	private String nom;
	private String prenom;
	private String adresse;
	private Date birthday;
	private List<Veterinaire> listVeterinaire;
	private List<Dresseur> listDresseur;
	
	
	
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(String login, String password, String role, String mobile,
			String nom, String prenom, String adresse) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdSession() {
		return idSession;
	}
	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	
	@OneToMany(mappedBy="session")
	public List<Veterinaire> getListVeterinaire() {
		return listVeterinaire;
	}
	public void setListVeterinaire(List<Veterinaire> listVeterinaire) {
		this.listVeterinaire = listVeterinaire;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@OneToMany(mappedBy="session")
	public List<Dresseur> getListDresseur() {
		return listDresseur;
	}
	public void setListDresseur(List<Dresseur> listDresseur) {
		this.listDresseur = listDresseur;
	}
	
	
	
	
	

}
