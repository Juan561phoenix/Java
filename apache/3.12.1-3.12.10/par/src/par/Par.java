/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par;

import java.util.Scanner;

/**
 *
 * @author Stork
 */
public class Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int num1, num2, mcd = 1;
        System.out.println("Ingresa el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingresa el segundo número: ");
        num2 = scan.nextInt();
        if (num1 % 2 == 0) {
            mcd = 1;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    mcd = i;
                }
            }
            System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es " + mcd);
        } else {
            System.out.println("El primer número no es un número par. No se mostrará el MCD");
        }
    }

}
