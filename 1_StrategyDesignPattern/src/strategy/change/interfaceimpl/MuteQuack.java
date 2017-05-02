package strategy.change.interfaceimpl;
import strategy.change.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Silence!!!!");

	}

}
