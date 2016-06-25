package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Dresseur;


@Stateless
public class DresseurService implements IDresseurService{

	@PersistenceContext(name="dogs_app")
	EntityManager em;
	
	@Override
	public void addDresseur(Dresseur d) {
		em.persist(d);
		
	}
	@Override
	public void deleteDresseur(Dresseur d) {
		Query query = em.createQuery("delete from Dresseur d where d.idDresseur = "+d.getIdDresseur());
		query.executeUpdate();
		
	}
	
	@Override
	public void updateDresseur(Dresseur d) {
		// TODO Auto-generated method stub
		em.merge(d);
		
	}

	@Override
	public List<Dresseur> getDresseur() {
		String req="select d from Dresseur d";
		Query query=em.createQuery(req);
		return (List<Dresseur>)query.getResultList();
	}
	
}
