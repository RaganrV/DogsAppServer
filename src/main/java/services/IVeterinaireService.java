package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Veterinaire;
@Remote
public interface IVeterinaireService {

	
	void addVeterinaire(Veterinaire v);
	void deleteVeterinaire(Veterinaire v);
	void updateVeterinaire(Veterinaire v);
	List<Veterinaire> getAllVeterinaire();
}
