package Tema2.WhileYFor;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //Pide una contraseña por teclado que tenga mas de 8 caracteres
        String password;

        do {
            System.out.println("Dime tu contraseña");
            password = sc.nextLine();
        } while (password.length() < 8);

        System.out.println("Tu contraseña es " + password);
         */

        //Muestra los números del 1 al 10 usando do-while
        int numero = 1;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 10);




    }
}
