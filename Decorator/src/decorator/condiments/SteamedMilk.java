package decorator.condiments;

import decorator.beverages.Beverage;

public class SteamedMilk extends CondimentsDecorator {
	private Beverage beverage;

	public SteamedMilk(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", SteamedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost()+.10;
	}

}
