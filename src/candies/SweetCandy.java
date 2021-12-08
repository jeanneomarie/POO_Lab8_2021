package candies;

public class SweetCandy extends Candy implements Meltable {

    private String sweetenerType;

    public SweetCandy(String name, double price, String sweetenerType) {
        super(name, price);
        this.sweetenerType = sweetenerType;
    }

    public String getSweetenerType() {
        return sweetenerType;
    }

    public void setSweetenerType(String sweetenerType) {
        this.sweetenerType = sweetenerType;
    }

    @Override
    public void printCandy() {
        System.out.println("SweetCandy {" +
                "name='" + super.getName() + '\'' +
                ", price=" + getPrice() + '}');
    }

    @Override
    public void melt() {
        System.out.println("SweetCandy " + super.getName() + " was melted!");
    }
}
