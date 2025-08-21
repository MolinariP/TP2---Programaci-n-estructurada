/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejercicio11;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejercicio11 {

    static double DESCUENTO_ESPECIAL = 0.10;


    public static void calcularDescuentoEspecial(double precio) {
     
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

   
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());


        calcularDescuentoEspecial(precio);
    }
}
