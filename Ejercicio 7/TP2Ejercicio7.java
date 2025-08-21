/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejercicio7;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10. ");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente: " + nota);
    }
    
}
