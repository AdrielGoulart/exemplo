package pizza;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizza extends SpecialPizza {

	public PepperoniPizza(double baseCost,boolean borda) {
		super("Pepperoni", baseCost,borda);
		List<Topping> topping = new ArrayList<>();
		topping.add(new Topping("Salame italiano", 2.90));
		topping.add(new Topping("Pimentão", 1.89));
		topping.add(new Topping("Queijo Mussarela", 2.10));
		topping.add(new Topping("Pimenta Calabresa", 0.87));
		topping.add(new Topping("Orégano", 0.66));
		setToppings(topping);
	}

}
