package tutorialpoint.Polymorphism;

public class Market {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruits banana2 = new Banana();
        ((Banana) banana2).peel();

        Fruits orange = new Fruits();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruits fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
    
}
