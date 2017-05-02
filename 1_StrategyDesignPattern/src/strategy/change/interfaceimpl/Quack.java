package strategy.change.interfaceimpl;
import strategy.change.interfaces.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack(){
		System.out.println("Quack!!");
	}
}
