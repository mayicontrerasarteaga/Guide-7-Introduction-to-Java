/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintro;
import java.util.Scanner;

/**
 *
 * @author Nezuko
 */
public class ej10 {
    
    public static void main(String[] args) {
        
        //ej10 For
        Scanner in = new Scanner(System.in);
        
        int num1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num4 = 0;
        
    
        System.out.println("Ingrese 4 números enteros positivos entre 1 y 20:");
        
        while (num1 < 1 || num1 > 20) {
            System.out.println("Ingrese número 1:");
            num1 = in.nextInt();            
        }
        
        while (num_2 < 1 || num_2 > 20) {
            System.out.println("Ingrese número 2:");
            num_2 = in.nextInt();            
        }
        
        while (num_3 < 1 || num_3 > 20) {
            System.out.println("Ingrese número 3:");
            num_3 = in.nextInt();            
        }
        
        while (num4 < 1 || num4 > 20) {
            System.out.println("Ingrese número 4:");
            num4 = in.nextInt();            
        }
        
        System.out.println("--------------------");
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        
        System.out.print(num_2);
        for (int i = 0; i < num_2; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        
        System.out.print(num_3);
        for (int i = 0; i < num_3; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");            
        }
        System.out.println("");
    }
}
