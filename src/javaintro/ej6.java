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
public class ej6 {
    public static void main(String[] args) {
        //ej6 If - else
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros:");
        
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        
        if (number1 > 25 || number2 > 25){ 
            System.out.println("Uno o los dos números es mayor que 25"); 
        } else {
            System.out.println("Ningún número es mayor que 25");
        }
    }
}
