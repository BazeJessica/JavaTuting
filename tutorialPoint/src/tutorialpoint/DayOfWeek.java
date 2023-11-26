package tutorialpoint;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thurday", "Friday" , "Saturday", "Sunday"};
        System.out.println("Input the a day of the week");
        int day = scanner.nextInt();
        scanner.close();
        
        System.out.println("Today is " + days[day -1]);



        }
    }

