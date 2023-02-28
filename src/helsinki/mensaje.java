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
public class mensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("write a message");
        
        Scanner sc = new Scanner(System.in);
        
        String mensaje = sc.nextLine();
        
        System.out.println(mensaje);
        
        String name = "Ada Lovelace";
        
        System.out.println("hi "+name+"!");
        
    }
    
}
