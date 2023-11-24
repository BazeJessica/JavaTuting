/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialpoint;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class DollarGame {
    public static void main(String[] args) {
        int[] ticket = genersteNumbers();
        printTicket(ticket);
    }

    private static final int LENGTH = 6;
    private static final int MAX_LENGTH = 69;

    public static int[] genersteNumbers() {
        Random random = new Random();
        int[] ticket = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_LENGTH) + 1;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " ");
        }

    }

}
