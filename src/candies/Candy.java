package candies;

public class Candy {
    private String name;
    private double price;
    private Discount discount;

    //overloading
    public Candy() {

    }

    public Candy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        double newPrice = 0;
        if (this.discount != null) {
            if (discount.equals(Discount.CHRISTMAS)) {
                double discount = this.price * .25;
                newPrice = this.price - discount;
            } else if (discount.equals(Discount.EASTER)) {
                double discount = this.price * .20;
                newPrice = this.price - discount;
            } else if (discount.equals(Discount.FIFTY_PERCENT)) {
                double discount = this.price * .50;
                newPrice = this.price - discount;
            }
        }
        return newPrice;
    }

    public void printCandy() {
        System.out.println("Candy {" +
                "name='" + name + '\'' +
                ", price=" + price + '}');
    }

    @Override
    public boolean equals(Object o) {
        Candy that = (Candy) o;
        return this.name.equals(that.name) && this.price == that.price;
    }

    @Override
    public String toString() {
        return "candies.Candy {" +
                "name='" + name + '\'' +
                ", price=" + price + '}';
    }


}
