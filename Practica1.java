/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escoja la letra correspondiente a la operación que quiera realizar");
        System.out.println("suma");
        System.out.println("Multiplicación");
        System.out.println("Salir");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        String suma =
        
        switch (opcion) {
            case suma:
                double suma = 20.5 + 40.6 + 78.4 + 94.7 + 55.3 + 22.6 + 84.3;
                System.out.println("el resultado de la suma es " + suma);
                
            break;
            default:
                throw new AssertionError();
        }
        
 
    }
    
}
