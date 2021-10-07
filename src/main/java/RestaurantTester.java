import java.util.ArrayList;
import java.util.List;

import controller.RestaurantHelper;
import model.ArcadeInventory;
import model.Restaurant;

/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Oct 7, 2021
 */
public class RestaurantTester {
	
	public static void main(String[] args) {
		
		RestaurantHelper rh = new RestaurantHelper();		
		ArcadeInventory mario = new ArcadeInventory ("Super Mario", .25, 100);
		ArcadeInventory luigi = new ArcadeInventory ("Super Luigi", .25, 300);
		List<ArcadeInventory> desmoinesArcadeList = new ArrayList<ArcadeInventory>();
		desmoinesArcadeList.add(mario);
		desmoinesArcadeList.add(luigi);
		Restaurant desmoines = new Restaurant("123 Fake Street", "Fernando Garcia", desmoinesArcadeList);
		rh.insertRestaurant(desmoines);
		List<ArcadeInventory> allArcades = rh.getArcadeInventory();
		for (ArcadeInventory a : allArcades) {
			System.out.println(a.returnArcadeDetails());
		}
		

	}

}
