package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ArcadeInventory;
import model.Restaurant;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 7, 2021
 */
public class RestaurantHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ArcadeInventory");
	
	public List<Restaurant> showAllRestaurants() {
		EntityManager em = emfactory.createEntityManager();		
		List<Restaurant> allRestaurants = em.createQuery("SELECT i FROM Restaurant i").getResultList();
		return allRestaurants;
	}
	
	public void insertRestaurant(Restaurant toInsert) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toInsert);
		em.getTransaction().commit();
		em.close();		
	}
	
	public void deleteRestaurant(Restaurant toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Restaurant> typedQuery = em.createQuery("SELECT r from "
				+ "Restaurant r where r.address = :selectedAddress and r.manager = "
				+ ":selectedManager and r.listOfArcades = :selectedListOfArcades", Restaurant.class);
		typedQuery.setParameter("selectedAddress", toDelete.getAddress());
		typedQuery.setParameter("selectedManager", toDelete.getManager());
		typedQuery.setParameter("selectedListOfArcades", toDelete.getListOfArcades());
		typedQuery.setMaxResults(1);		
		Restaurant result = typedQuery.getSingleResult();		
		em.remove(result);
		em.getTransaction().commit();
		em.close();		
	}
	
	public void updateItem(Restaurant toUpdate) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toUpdate);
		em.getTransaction().commit();
		em.close();		
	}
	
	public Restaurant lookupRestaurantById(int toLookup) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Restaurant found = em.find(Restaurant.class, toLookup);
		em.close();
		return found;
	}
	
	public List<ArcadeInventory> getArcadeInventory() {
		EntityManager em = emfactory.createEntityManager();
		List<ArcadeInventory> allArcadeInventory = em.createQuery("SELECT ai FROM ArcadeInventory ai").getResultList();
		return allArcadeInventory;
	}
	
	public void cleanUp() {
		emfactory.close();
	}
	
	
	
	
	

}
