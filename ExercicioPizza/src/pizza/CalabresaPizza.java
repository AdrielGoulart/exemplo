package pizza;

import java.util.ArrayList;
import java.util.List;

public class CalabresaPizza extends TraditionalPizza{

	public CalabresaPizza(double baseCost,boolean borda) {
		super("Calabresa", baseCost,borda);
		List<Topping> topping = new ArrayList<>();
		topping.add(new Topping("Molho de Tomate",0.99));
		topping.add(new Topping("Queijo Mussarela",2.10));
		topping.add(new Topping("Calabresa",2.22));
		topping.add(new Topping("Azeitona",0.20));
		topping.add(new Topping("Orégano",0.66));
		setToppings(topping);
	}

}


