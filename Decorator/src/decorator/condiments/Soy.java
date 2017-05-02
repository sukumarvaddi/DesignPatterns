package decorator.condiments;

import decorator.beverages.Beverage;

public class Soy extends CondimentsDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+.15;
	}

}
