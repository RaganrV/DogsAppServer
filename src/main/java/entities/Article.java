package entities;

import java.io.Serializable;

public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idArticle;
	private String race;
	private String titre;
	private String description;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String race, String titre, String description) {
		super();
		this.race = race;
		this.titre = titre;
		this.description = description;
	}
	
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
