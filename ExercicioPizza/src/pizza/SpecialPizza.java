package pizza;

public abstract class SpecialPizza extends Pizza{
	public SpecialPizza(String name, double baseCost,boolean borda) {
		super(name, baseCost, borda);
	}

	@Override
	public double cost() {
		return super.cost() * 1.2;
	}
}