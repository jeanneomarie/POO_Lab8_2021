package candies;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ioana", 50);
        Candy candy1 = new Candy("toffee", 20);
        Candy candy2 = new Candy("chocolate", 40);
        candy2.setDiscount(Discount.FIFTY_PERCENT);
        Candy candy3 = new Candy("almond", 5);
        Candy candy4 = new Candy("kinder", 6);

        Order order = new Order(1, client, 3);
        order.addCandy(candy1);
        order.addCandy(candy2);
        order.addCandy(candy3);
        order.printOrder();

        order.removeCandy(candy1);
        order.printOrder();

        Candy sweetCandy = new SweetCandy("lion", 18, "caramel");
        Candy saltedCandy = new SaltedCandy("twix", 23);

        candy1.printCandy();
        sweetCandy.printCandy();
        saltedCandy.printCandy();

        Meltable sweetCandy1 = new SweetCandy("m&m", 23, "caramel");
        sweetCandy1.melt();
    }
}
