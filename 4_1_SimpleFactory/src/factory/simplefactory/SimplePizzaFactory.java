package factory.simplefactory;

import factory.simplefactory.pizzatypes.CheesePizza;
import factory.simplefactory.pizzatypes.ClamPizza;
import factory.simplefactory.pizzatypes.PepperoniPizza;
import factory.simplefactory.pizzatypes.Pizza;
import factory.simplefactory.pizzatypes.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
