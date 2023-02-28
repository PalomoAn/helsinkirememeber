/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helsinki;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class integerSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int numbersRead = 0;
        int sum = 0;

        while (true) {
            if (numbersRead == 5) {
                break;
            }

            System.out.println("Input number");
            sum = sum + Integer.valueOf(scanner.nextLine());
            numbersRead = numbersRead + 1;
        }

        System.out.println("The sum of the numbers is " + sum);
    }

}
