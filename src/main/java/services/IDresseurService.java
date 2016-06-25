package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Dresseur;
@Remote
public interface IDresseurService {

	void addDresseur(Dresseur d);
	void deleteDresseur(Dresseur d);
	void updateDresseur(Dresseur d);
	List<Dresseur> getDresseur();
}
