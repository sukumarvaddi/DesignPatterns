package strategy.test;

import strategy.change.interfaceimpl.FlyWithRockets;
import strategy.change.interfaceimpl.Squeak;
import strategy.nochange.classes.Duck;
import strategy.nochange.classes.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("--------------------------------");
		System.out.println("AFTER CHANGING THE  FLY BEHAVIOR AND QUACK BEHAVIOR DYNAMICALLY");
		
		mallard.setFlyBehavior(new FlyWithRockets());
		mallard.setQuackBehavior(new Squeak());
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
	}

}
