/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, positivos = 0, negativos = 0, ceros = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }
        }
        System.out.println("Resultados: \nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
    } 
    
}
