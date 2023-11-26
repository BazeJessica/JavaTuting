package tutorialpoint.Polymorphism;

public class Apple extends Fruits{

    public Apple(){
       setCalories(95);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple Grapes juice made");

    }

    public void removeSeeds(){
        System.out.println(" Remove seeds in this fruit before eating");
    }
    
}
