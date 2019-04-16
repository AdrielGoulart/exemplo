package pizza;

import java.util.ArrayList;
import java.util.List;

public class NapolitanPizza extends SpecialPizza {
	public NapolitanPizza(double baseCost,boolean borda) {
		super("Napolitana", baseCost,borda);
		List<Topping> topping = new ArrayList<>();
		topping.add(new Topping("Presunto", 1.10));
		topping.add(new Topping("Salsa", 0.80));
		topping.add(new Topping("Tomate", 2.19));
		topping.add(new Topping("Azeitona", 0.20));
		topping.add(new Topping("Queijo Mussarela", 2.10));
		setToppings(topping);
	}

}
