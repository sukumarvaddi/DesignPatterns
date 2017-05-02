package strategy.nochange.classes;
import strategy.change.interfaces.FlyBehavior;
import strategy.change.interfaces.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBevior;
	private QuackBehavior quackBehavior;
	
	public Duck(FlyBehavior fly, QuackBehavior quack){
		this.flyBevior = fly;
		this.quackBehavior = quack;
	}
	
	public void performFly(){
		flyBevior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public abstract void display(); 
	
	public void swmim() {
		System.out.println("All ducks float in the water, even decoys!!");
	}
	
	public void setFlyBehavior(FlyBehavior fly){
		this.flyBevior = fly;
	}
	
	public void setQuackBehavior(QuackBehavior quack){
		this.quackBehavior = quack;
	}
	
}
