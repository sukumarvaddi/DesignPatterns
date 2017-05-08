package factory.pizza.app;

import factory.pizzastore.NYPizzaStore;
import factory.pizzastore.PizzaStore;

public class FactoryApp {
	public static void main(String[] args){
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("cheese");
	}
}
