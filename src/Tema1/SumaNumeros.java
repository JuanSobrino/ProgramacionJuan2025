package Tema1;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        int num1, num2, suma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        num1 = sc.nextInt();

        System.out.println("Dime otro número");
        num2 = sc.nextInt();

        suma = num1 + num2;

        System.out.println("La suma es " + suma);



    }
}
