import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    
    public static void main(String[] args) {
       /*
       We are to first generate a random number which serves as our base for comparison(between 1 to 100)
       We allow the user to enter his or her chosen number(up to 10 numbers)
       We compare her chosen number to our base number to see if it matches
     */
    
     final int LENGTH = 10;
     final int MAX_LENGTH = 100;
    Scanner scanner = new Scanner(System.in);

    
        int []guesses =new int[10];

        Random random = new Random();
        int count = 1;

        int baseNumber = random.nextInt(MAX_LENGTH) + 1;

        for(int i=0;i<LENGTH;i++){

            System.out.print("Input guess "+ count + "::");

            int choice = scanner.nextInt();

            guesses[i]=choice;

            if(count == LENGTH){
                System.out.println("You have exhausted all gueses");
                break;
                
            }else if(choice == baseNumber){
                System.out.println("""
                    Congratulation!! You guessed right.

                """);
               break;
            }else{
                if(choice < baseNumber){
                    System.out.println("Guessed number is too low");

                }else if(choice > baseNumber){
                    System.out.println("Number guessed is too high");
                }
            }
            
            count++;

        }

        for(int guess:guesses){
            System.out.print(guess);
        }
        scanner.close();

    }
}