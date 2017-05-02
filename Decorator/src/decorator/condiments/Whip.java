package decorator.condiments;

import decorator.beverages.Beverage;

public class Whip extends CondimentsDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+.10;
	}

}
