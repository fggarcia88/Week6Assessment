package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 7, 2021
 */
@Entity
@Table(name="Restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	@Column (name="RESTAURANTID")
	private int id;
	@Column (name="ADDRESS")
	private String address;
	@Column (name="MANAGER")
	private String manager;
	@JoinColumn (name="ARCADELIST")
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	private List<ArcadeInventory> listOfArcades;
	
	public Restaurant() {}
	
	public Restaurant(String address, String manager, List<ArcadeInventory> listOfArcades) {
		this.address = address;
		this.manager = manager;
		this.listOfArcades = listOfArcades;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ArcadeInventory> getListOfArcades() {
		return listOfArcades;
	}

	public void setListOfArcades(List<ArcadeInventory> listOfArcades) {
		this.listOfArcades = listOfArcades;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public String returnRestaurantDetails() {
		return "ID: " + this.id + " Address: " + this.address + ", Manager: " + this.manager
				+ ", List of Arcades: " + this.listOfArcades;
	}
	
	
	

}
