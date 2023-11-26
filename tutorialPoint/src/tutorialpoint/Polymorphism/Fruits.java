package tutorialpoint.Polymorphism;

public class Fruits {
    private int calories;
    
    public void setCalories(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return this.calories;
    }

    // public Fruits(int calories){
    //     setCalories(calories);
    // }


    public void makeJuice(){
        System.out.println(" Juice is made!!");
    }
    
}
