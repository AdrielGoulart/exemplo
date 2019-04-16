package pizza;

import java.util.List;
import java.util.ArrayList;

public abstract class Pizza {
	private String name;
	private double baseCost;
	private boolean borda;
	private List<Topping> toppings = new ArrayList<Topping>();

	public Pizza() {

	}

	public Pizza(String name, double baseCost, boolean borda) {
		this.setName(name);
		this.setBaseCost(baseCost);
		this.setBorda(borda);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}

	public double cost() {

		for (Topping topping : toppings) {
			baseCost = baseCost + topping.getCost();
		}
		
		if (isBorda()) {
			return baseCost + 5.0;
		} else {
			return baseCost;
		}
	}

	@Override
	public String toString() {
		return "Pizza[Nome=" + name + ",mBaseCost=" + baseCost + "toppings=" + toppings + "]";
	}

}