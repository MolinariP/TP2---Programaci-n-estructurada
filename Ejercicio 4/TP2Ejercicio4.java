/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double precioOriginal, descuento = 0, precioFinal;
        char categoria;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        precioOriginal = Double.parseDouble(input.nextLine());
    
        System.out.println("Ingrese la categoría (A, B o C): ");
        categoria = input.nextLine().toUpperCase().charAt(0);
        
        if (categoria == 'A') {
            descuento = 10;
        } else if (categoria == 'B') {
            descuento = 15;
        } else if (categoria == 'C') {
            descuento = 20;
            
        } else {
            System.out.println("La categoría ingressada es incorrecta.");
            return;
        }
        
        precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
        
        
    }
    
}
