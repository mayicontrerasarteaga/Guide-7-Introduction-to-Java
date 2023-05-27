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
public class Prueba {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        
    
        System.out.println("Ingrese 4 números enteros positivos entre 1 y 20:");
        
        while (num1 < 1 || num1 > 20) {
            System.out.println("Ingrese número 1:");
            num1 = in.nextInt();            
        }
        
        while (num2 < 1 || num2 > 20) {
            System.out.println("Ingrese número 2:");
            num2 = in.nextInt();            
        }
        
        while (num3 < 1 || num3 > 20) {
            System.out.println("Ingrese número 3:");
            num3 = in.nextInt();            
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
        
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
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
