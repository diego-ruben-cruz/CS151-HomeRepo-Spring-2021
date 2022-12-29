package part1;

public class BurgerTester {
	public static void main(String[] args) {
		ImpossibleBurger impossible = new ImpossibleBurger();
        Burger burger = impossible;
        burger.madeFrom();
	}
}