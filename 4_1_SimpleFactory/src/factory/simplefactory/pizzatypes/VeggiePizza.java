package factory.simplefactory.pizzatypes;

public class VeggiePizza extends Pizza {
	public VeggiePizza(){
		name = "Veggie Pizza";
		dough = "All Purpose flour";
		sauce= "Veggie Maranira";
		toppings.add("Tomoato");
		toppings.add("Onion");
		toppings.add("Green Pepper");
	}
}
