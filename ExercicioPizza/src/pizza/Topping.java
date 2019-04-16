package pizza;

public class Topping {

	private String name;
	private double cost;

	public Topping(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Topping[Nome=" + name + ",cost=" + cost + "]";
	}

}
