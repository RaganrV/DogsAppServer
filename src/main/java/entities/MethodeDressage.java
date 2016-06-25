package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class MethodeDressage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int idMethodeDressage;
	private String race;
	private String titreMethodeDressage;
	private String descriptionMethodeDressage;
	private Session session;
	public MethodeDressage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MethodeDressage(String race, String titreMethodeDressage,
			String descriptionMethodeDressage) {
		super();
		this.race = race;
		this.titreMethodeDressage = titreMethodeDressage;
		this.descriptionMethodeDressage = descriptionMethodeDressage;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdMethodeDressage() {
		return idMethodeDressage;
	}
	public void setIdMethodeDressage(int idMethodeDressage) {
		this.idMethodeDressage = idMethodeDressage;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getTitreMethodeDressage() {
		return titreMethodeDressage;
	}
	public void setTitreMethodeDressage(String titreMethodeDressage) {
		this.titreMethodeDressage = titreMethodeDressage;
	}
	public String getDescriptionMethodeDressage() {
		return descriptionMethodeDressage;
	}
	public void setDescriptionMethodeDressage(String descriptionMethodeDressage) {
		this.descriptionMethodeDressage = descriptionMethodeDressage;
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
