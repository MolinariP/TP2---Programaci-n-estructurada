/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
    
}
