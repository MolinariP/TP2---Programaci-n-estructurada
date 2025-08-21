/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, numMayor;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
          
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());        
        
        System.out.println("Ingrese el tercer numero entero: ");
        num3 = Integer.parseInt(input.nextLine());
    
              if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }

        System.out.println("De los tres numeros el mayor es: " + numMayor);
         
    }
 
}
