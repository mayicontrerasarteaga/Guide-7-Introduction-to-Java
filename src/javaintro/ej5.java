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
public class ej5 {
    
    public static void main(String[] args) {
        //ej5 Input - Save values with this class
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = in.nextLine();
        
        System.out.println("Ingresa tu edad:");
        int edad = in.nextInt();
        
        System.out.println("Ingresa tu estatura:");
        double estatura;
        estatura = in.nextDouble();
        
        System.out.println("Eres mayor de edad?");
        boolean mayorEdad = in.nextBoolean();
    }
}
