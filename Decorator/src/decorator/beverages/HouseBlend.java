package decorator.beverages;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		super.setDescription("House Blend Coffe");
	}
	
	@Override
	public double cost() {
		return .89;
	}

}
