package factory.simplefactory.app;

import factory.simplefactory.PizzaStore;
import factory.simplefactory.SimplePizzaFactory;

public class SimpleFactoryApp {
	public static void main(String[] args){
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.orderPizza("veggie");
	}
}
