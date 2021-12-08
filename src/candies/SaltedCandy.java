package candies;

public class SaltedCandy extends Candy {

    public SaltedCandy(String name, double price) {
        super(name, price);
    }

    @Override
    public void printCandy() {
        System.out.println("SaltedCandy {" +
                "name='" + super.getName() + '\'' +
                ", price=" + getPrice() + '}');
    }
}
