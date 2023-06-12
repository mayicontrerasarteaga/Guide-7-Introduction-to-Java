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
public class ej9 {
    
    public static void main(String[] args) {
        
         //ej9 Do While
        int num_20;
        int cont = 0;
        int summa = 0;
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese 20 números enteros positivos:");
        
        do {
            num_20 = in.nextInt();
            cont = cont + 1;
            if (num_20 > 0){
                summa = summa + num_20;
            }
            if (num_20 == 0) {
                System.out.println("¡Se capturó el número cero!");
                break;
            }         
        } while (cont < 20);
           
        System.out.println("La suma de los números ingresados es " + summa);
    }
}
