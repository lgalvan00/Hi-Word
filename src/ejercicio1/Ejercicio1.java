/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma,num1,num2;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese Un Numero Entero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese otro Numero Entero: ");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numero es = " + suma);
        
    }
    
}
