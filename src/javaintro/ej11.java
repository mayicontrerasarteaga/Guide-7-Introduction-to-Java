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
public class ej11 {
    
    public static void main(String[] args) {
    
    //ej11 Functions
        
        String frase;
        
        int dotIdx;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        
        frase = in.nextLine();
        dotIdx = frase.indexOf(".");
        
        if (dotIdx == -1) {
            System.out.println("La frase no contiene ningún punto");
            System.exit(1); //Termina el programa con código de error
        }
        
        frase = frase.substring(0, dotIdx+1);
        
        System.out.println(frase);
        
        String nuevaFrase = codificar(frase);
        
        System.out.println("La frase codificada es: " + nuevaFrase);
        
    }
    /**
     *
     * @param frase
     * @return
     */
    public static String codificar(String frase){
        
        String nuevaFrase;
        nuevaFrase = "";
                     
        for (int i = 0; i < frase.length(); i++) {
            switch(frase.charAt(i)) {
                case 'a':
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case 'e':
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                case 'i':
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                case 'o':
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                case 'u':
                    nuevaFrase = nuevaFrase.concat("*");
                    break;
                default:
                    nuevaFrase = nuevaFrase.concat(String.valueOf(frase.charAt(i)));
                    break;
            }        
        }
        return nuevaFrase;
    }
}
