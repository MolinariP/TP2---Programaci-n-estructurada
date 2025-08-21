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
        // TODO code application logic here
           // 4. Calculadora de Descuento
       /* System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.print("Ingrese la categoría (A, B o C): ");
        char cat = scan.next().toUpperCase().charAt(0);
        double descuento = 0;
        if (cat == 'A') descuento = 0.10;
        else if (cat == 'B') descuento = 0.15;
        else if (cat == 'C') descuento = 0.20;
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);*/
        
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
