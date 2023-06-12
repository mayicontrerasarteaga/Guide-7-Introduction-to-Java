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
public class ej8 {
    
    public static void main(String[] args) {
        
        //ej8 While
        int note;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una nota válida (entre 0 y 10):");
        note = in.nextInt();
    
        while (note < 0 || note > 10) {
            System.out.println("Ingrese una nota válida (entre 0 y 10):");
            note = in.nextInt();  
        }
        System.out.println("La nota ingresada es válida");
    }
}
