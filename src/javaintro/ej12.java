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
public class ej12 {
    
    public static void main(String[] args) {
        
        int numer1;
        int numer2;
        
        Scanner in = new Scanner(System.in);
                      
        System.out.println("Ingresa dos números para validar que el primero es múltiplo del segundo:");
        numer1 = in.nextInt();
        numer2 = in.nextInt();
        
    }
    
    public static void EsMultiplo (int numer1, int numer2){
                
        if (numer1%numer2 == 0){
            System.out.println("El número " + numer1 + " es múltiplo de " + numer2);
        } else {
            System.out.println("El número " + numer1 + " no es múltiplo de " + numer2);
        }
    }  
}
