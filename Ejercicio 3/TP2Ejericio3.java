/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejericio3;

import java.util.Scanner;

/**
 *
 * @author 54234
 */
public class TP2Ejericio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
    
        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad < 18) {
            System.out.println("Eres un Adolescente");
        } else if (edad < 60) {
            System.out.println("Eres un Adulto");
        } else System.out.println("Eres un Adulto mayor");

    }
    
}
