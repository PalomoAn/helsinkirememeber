/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helsinki;

import java.util.Scanner;

/**
 *Write a program that reads two integers from the 
 * user and prints the square root of the sum of these integers.
 * The program does not need to work with negative values.
 */
public class cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("dame un numero");
        n1 = sc.nextInt();
        System.out.println("dame otro numbero");
        n2=sc.nextInt();
        int suma = n1+n2;
        double potencia = Math.pow(suma, 2);
        System.out.println("la potencia es "+potencia);
        
        
    }
    
}
