package pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pizza> pizzas = new ArrayList<Pizza>();

		Pizza QuatroQ = new FourCheesePizza(45.0, true);
		Pizza Calabresa = new CalabresaPizza(50.0, false);
		Pizza Pepperoni = new PepperoniPizza(55.0, true);
		Pizza Napolitana = new NapolitanPizza(53.0, false);

		pizzas.add(QuatroQ);
		pizzas.add(Calabresa);
		pizzas.add(Pepperoni);
		pizzas.add(Napolitana);

		System.out.println("Questão 1 e 3:");
		for (Pizza pizza : pizzas) {
			System.out.println("Sabor da Pizza:" + pizza.getName() + " Valor a pagar:" + pizza.cost());
		}

	}

}
