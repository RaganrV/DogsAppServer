package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Veterinaire;


@Stateless
public class VeterinaireService implements IVeterinaireService{
	@PersistenceContext(name="dogs_app")
	EntityManager em;
	
	@Override
	public void addVeterinaire(Veterinaire v) {
		em.persist(v);
		
	}
	@Override
	public void deleteVeterinaire(Veterinaire v) {
		Query query = em.createQuery("delete from Veterinaire v where v.idVeterinaire = "+v.getIdVeterinaire());
		query.executeUpdate();
		
	}
	
	@Override
	public void updateVeterinaire(Veterinaire v) {
		// TODO Auto-generated method stub
		em.merge(v);
		
	}

	@Override
	public List<Veterinaire> getAllVeterinaire() {
		String req="select v from Veterinaire v";
		Query query=em.createQuery(req);
		return (List<Veterinaire>)query.getResultList();
	}
	
	
}
