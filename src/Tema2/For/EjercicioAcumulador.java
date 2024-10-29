package Tema2.For;

import java.util.Scanner;

public class EjercicioAcumulador {

    public static void main(String[] args) {

        //Pide por teclado 5 precios por teclado
        //Imprime el total

        Scanner sc = new Scanner(System.in);
        int precio;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime un precio");
            precio = sc.nextInt();
            total = total + precio;
        }

        System.out.println("El precio total es " + total);














    }
}
