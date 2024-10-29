package Tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio10Hoja {

    public static void main(String[] args) {

        //Escribe un programa que resuelva una ecuación de segundo grado del tipo AX² + BX + C

        //double a;
        //double b;
        //double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el valor de a:");
        double a = sc.nextDouble();

        System.out.println("Indica el valor de b:");
        double b = sc.nextDouble();

        System.out.println("Indica el valor de c:");
        double c = sc.nextDouble();

        double comprobacion = (Math.pow(b,2) - 4*a*c);

        if (a == 0) {
            System.out.println("Error");
        } else {
            if (comprobacion >= 0) {
                System.out.println((-b + Math.sqrt(comprobacion)) / 2*a);
                System.out.println((-b - Math.sqrt(comprobacion)) / 2*a);
            } else {
                System.out.println("No es válido");
            }
        }



    }
}
