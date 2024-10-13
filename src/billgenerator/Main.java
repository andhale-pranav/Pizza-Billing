package billgenerator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DeluxePizza dp = new DeluxePizza(true);
        System.out.println(dp.getPrice());
        dp.addTakeaway();
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println(dp.getBill());

        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());

    }
}
