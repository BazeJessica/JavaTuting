/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialpoint;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class DollarGame {
    public static void main(String[] args) {
        int[] ticket = genersteNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    private static final int LENGTH = 6;
    private static final int MAX_LENGTH = 69;

    public static int[] genersteNumbers() {
        Random random = new Random();
        int[] ticket = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
        do{
            randomNumber = random.nextInt(MAX_LENGTH) + 1;

        }while(search(ticket,randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }
    
    public static boolean search(int [] array, int numerRandomNumber){
        for(int value:array){
            if(value == numerRandomNumber){
                return true;
            }
        }

        return false;
    }
public static boolean binarySearch(int []array, int numberToSearch){
    Arrays.sort(array);
    int index = Arrays.binarySearch(array, numberToSearch);
    if(index >= 0){
        return true;
    }
    else return false;
}
    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " ");
        }

    }

}
