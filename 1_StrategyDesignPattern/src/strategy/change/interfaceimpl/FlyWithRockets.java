package strategy.change.interfaceimpl;

import strategy.change.interfaces.FlyBehavior;

public class FlyWithRockets implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly with rockets");
	}

}
