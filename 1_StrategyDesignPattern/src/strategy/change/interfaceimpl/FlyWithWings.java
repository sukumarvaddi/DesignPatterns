package strategy.change.interfaceimpl;
import strategy.change.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly with wings!!");

	}

}
