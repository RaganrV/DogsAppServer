package services;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import entities.MethodeDressage;

@Stateless
public class MethodeDressageService implements IMethodeDressageService {
	
	@PersistenceContext(name="dogs_app")
	EntityManager em;
	
	@Override
	public void addMethodeDressage(MethodeDressage m) {
		em.persist(m);
		
	}
	@Override
	public void deleteMethodeDressage(MethodeDressage m) {
		Query query = em.createQuery("delete from MethodeDressage m where m.idMethodeDressage = "+m.getIdMethodeDressage());
		query.executeUpdate();
		
	}
	
	@Override
	public void updateMethodeDressage(MethodeDressage m) {
		// TODO Auto-generated method stub
		em.merge(m);
		
	}

	@Override
	public List<MethodeDressage> getAllMethodeDressage() {
		String req="select m from MethodeDressage m";
		Query query=em.createQuery(req);
		return (List<MethodeDressage>)query.getResultList();
	}
	


}
