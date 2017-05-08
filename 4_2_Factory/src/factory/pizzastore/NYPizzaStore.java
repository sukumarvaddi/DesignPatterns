package factory.pizzastore;

import factory.pizza.NYStyleCheesePizza;
import factory.pizza.NYStyleClamPizza;
import factory.pizza.NYStylePepperoniPizza;
import factory.pizza.NYStyleVeggiePizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			return null;
		}

	}

}
