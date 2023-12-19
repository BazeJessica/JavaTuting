
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        //General flow of logic
    do{
          System.out.println("Enter the first value ");
        int firstValue = scanner.nextInt();

        System.out.println("Enter the second value ");
        int secondValue = scanner.nextInt();
        System.out.println("""
                Select the type of arithmetic operation you would want to work on
                                  addition  :: +
                                   subtract :: -
                                   multiply :: *
                                   divide   :: /
                                   modulos  :: %
                   """);
        double answer = 0;
        String choice = scanner.next();
        if (choice.equals("+")) {

            answer = add(firstValue, secondValue);

        } else if (choice.equals("-")) {

            answer = subtract(firstValue, secondValue);

        } else if (choice.equals("*")) {

            answer = multiply(firstValue, secondValue);

        } else if (choice.equals("/")) {
            try {
                answer =  divide(firstValue, secondValue);
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (choice.equals("%")) {

            answer = modulos(firstValue, secondValue);
        }

        System.out.println(answer);

        System.out.println("Enter 'exit' || '0' to quit");
            String input = scanner.next();

            if (input.equals("exit") || input.equals("0")) {
                running = false;
            }
            scanner.close();
    }while(running);

    }    
      //Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
//Method for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
//Method for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
//Mehod for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    
        return num1 /  num2;
    }

//Method for modulos
    public static int modulos(int num1, int num2) {
        return num1 % num2;
    }
}