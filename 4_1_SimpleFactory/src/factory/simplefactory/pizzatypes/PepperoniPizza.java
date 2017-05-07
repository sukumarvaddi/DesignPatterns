package factory.simplefactory.pizzatypes;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "All Purpose flour";
		sauce = "Pepperoni Maranira";
		toppings.add("Tomoato");
		toppings.add("Onion");
		toppings.add("Green Pepper");
	}
}
