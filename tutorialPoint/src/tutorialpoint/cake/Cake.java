package tutorialpoint.cake;

public class Cake {
    private String flavor;
    private double price;

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);

    }
}
