package pizza;

import java.util.ArrayList;
import java.util.List;

public class FourCheesePizza extends TraditionalPizza {

	public FourCheesePizza(double baseCost,boolean borda) {
		super("4 Queijos", baseCost,borda);
		List<Topping> topping = new ArrayList<>();
		topping.add(new Topping("Molho de Tomate", 0.99));
		topping.add(new Topping("Queijo Mussarela", 2.10));
		topping.add(new Topping("Catupiry", 3.10));
		topping.add(new Topping("Cebola Roxa", 0.90));
		topping.add(new Topping("Queijo Gorgonzola",1.98));
		setToppings(topping);
	}

}
