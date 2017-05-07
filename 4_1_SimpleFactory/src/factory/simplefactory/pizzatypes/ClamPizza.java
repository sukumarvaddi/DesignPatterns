package factory.simplefactory.pizzatypes;

public class ClamPizza extends Pizza {

	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Clam Flour";
		sauce = "Clam Maranira";
		toppings.add("Mozzarella Cheese");
		toppings.add("Parmesan Pizza");
		toppings.add("Argula");
	}
}
