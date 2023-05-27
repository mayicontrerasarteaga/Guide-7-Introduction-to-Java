/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;
import java.util.Scanner;
/**
 *
 * @author Nezuko
 */
public class JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ej1 Declare variables
        //use ; to the end of statement
        byte number1;
        short number2;
        int number3;
        long number4;
        float decimal1;
        double decimal2;
        boolean activate;
        char word;
        String word2;
        
        //ej2 Assign value
        int num_1 = 1;
        float num2 = 1;
        double num3 = 1.23;
        boolean activate = true;
        String name = "Nezuko";
        
        //ej4 Output
        System.out.println("Hello World!");
        System.out.println("Hello World! " + name);
        System.out.print("Hello World! ");
        System.out.print(name);
        System.out.println("");
         
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
        
        //Control Structures
        
            //ej6 If - else
        System.out.println("Ingrese dos números enteros:");
        
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        
        if (number1 > 25 || number2 > 25){ 
            System.out.println("Uno o los dos números es mayor que 25"); 
        } else {
            System.out.println("Ningún número es mayor que 25");
        }
        
            //ej7 Switch
        
        int tipoMotor;
        
        System.out.println("Ingrese el número del motor del 1 al 4:");
        tipoMotor = in.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para el tipo de bomba");
                break;
        }
        
        //Loops
            //ej8 While
        int note;
        System.out.println("Ingrese una nota válida (entre 0 y 10):");
        note = in.nextInt();
    
        while (note < 0 || note > 10) {
            System.out.println("Ingrese una nota válida (entre 0 y 10):");
            note = in.nextInt();
            
        }
        System.out.println("La nota ingresada es válida");
     
            //ej9 Do While
        int num_20;
        int cont = 0;
        int summa = 0;
    
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
        
            //ej10 For
        
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
            
        //ej11 Functions
        
        //ej12 Subprograms
    }
}
