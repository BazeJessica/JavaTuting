package tutorialpoint.Polymorphism;

public class Banana extends Fruits {

    public Banana(){
        setCalories(105);
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana Carrot juice made");

    }

    public void peel(){
        System.out.println("This fruit should be peeled before eating");
    }
    
}
