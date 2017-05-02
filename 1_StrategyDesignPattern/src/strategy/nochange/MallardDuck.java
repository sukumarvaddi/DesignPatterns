package strategy.nochange;

import strategy.change.interfaceimpl.FlyWithWings;
import strategy.change.interfaceimpl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("Mallard Duck");

	}

}
