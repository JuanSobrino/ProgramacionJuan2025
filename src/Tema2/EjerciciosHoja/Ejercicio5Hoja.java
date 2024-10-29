package Tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio5Hoja {

    public static void main(String[] args) {

        int año;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año");
        año = sc.nextInt();

        //Comprobar si es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }


    }
}
