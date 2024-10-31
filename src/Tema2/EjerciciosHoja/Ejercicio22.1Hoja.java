package Tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio22Hoja {

    public static int darleLaVueltaString(int numero) {
        int numeroReves = 0;

        String numeroCadena = String.valueOf(numero); //Pasar de int a String
        StringBuffer strb = new StringBuffer(numeroCadena);
        strb.reverse();
        numeroReves = Integer.parseInt(strb.toString());

        return numeroReves;
    }

    public static void main(String[] args) {

        //Capicúa de un número entre 1 y 9999
        //4114 si
        //4116 no
        //Darle la vuelta 4116 - 6114 son diferentes
        //Darle la vuelta 4114 - 4114 son iguales --> Capicúa

        int numero, numeroReves;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número entre 1 y 9999");
            numero = Integer.parseInt(sc.nextLine());
            numeroReves = darleLaVueltaString(numero);
            System.out.println(numeroReves);
            if (numero == numeroReves) {
                System.out.println("Es capicúa");
            } else {
                System.out.println("No es capicúa");
            }
        } catch (Exception e) {
            System.out.println("Error en la lectura de número");
        }


    }
}
