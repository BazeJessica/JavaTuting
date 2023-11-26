package tutorialpoint.cake;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake() {
        super(" Vanilla");
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public int getCandles() {
        return this.candles;
    }
}
