import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    private static List<String> currentList = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menuItem = -1;

        /*
         * Display menu list of task to be completed
         * A simple todo list that allows users to
         * Add contents to a list
         * Remove content from a list
         * View content from a list
         * Exit the program
         */
        do {
            try {
                menuItem = menuList();

            switch (menuItem) {
                case 1:
                    addToList();
                    break;
                case 2:
                    RemoveFromList();
                    break;
                case 3:
                    ViewList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Oops you chose a wrong value");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
            
        } while (menuItem != 0);
    }

    public static int menuList() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("""
                below are some task you can undertake
                Hello welccome to my todoList forum,
                    1::    Add contents to a list
                    2::    Remove content from a list
                    3::    View content from a list
                    0::    Exit the program
                """);
        int menuChoice = scanner.nextInt();
        
        return menuChoice;
    }

    public static void addToList() {
        int answer=0;
        System.out.print("Enter a todo item:: ");
        // int answer = scanner.nextInt();
        String item = scanner.next();
        currentList.add(answer + " " + item);
        answer += 1;

    }

    public static void ViewList() {
        System.out.println("To-Do List");
        for (String items : currentList) {
            System.out.println(items);
        }
    }

    public static void RemoveFromList() {
        ViewList();
        System.out.print("Enter the item number to be removed:: ");
        int choice = scanner.nextInt();
        for (int j = 0; j < currentList.size(); j++) {
            if (choice == j) {
                currentList.remove(j);
            }
        }
        
    }

}