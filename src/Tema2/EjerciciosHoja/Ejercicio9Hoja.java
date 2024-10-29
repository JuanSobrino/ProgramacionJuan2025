package Tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio9Hoja {

    public static void main(String[] args) {

        //Pide número entre 1 y 12, devuelve el número de días de ese mes
        //2 --> 28
        //1,3,5,7,8,10,12 --> 31
        //4,6,9,11 --> 30

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número de mes");
        int mes = sc.nextInt();

        switch (mes) {
            case 2:
                System.out.println("28 días");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("31 días");
                break;
            case 4,6,9,11:
                System.out.println("30 días");
                break;
        }






    }
}
