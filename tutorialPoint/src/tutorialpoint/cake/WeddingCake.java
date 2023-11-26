package tutorialpoint.cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        super("Almond");
    }

    public void setCandles(int tiers) {
        this.tiers = tiers;
    }

    public int getCandles() {
        return this.tiers;
    }

}
