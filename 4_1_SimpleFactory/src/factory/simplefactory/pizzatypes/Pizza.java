package factory.simplefactory.pizzatypes;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparing:" + name);
		System.out.println("Tossing Dough...");
		System.out.println("Adding Sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagnol slices");
		
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
		
	}

	public String getName() {
		return name;
	}

}
