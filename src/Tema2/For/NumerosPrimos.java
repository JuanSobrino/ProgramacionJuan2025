package Tema2.For;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {

        //Introduce un número y di si es un número o no
        //Primo: Solo divisible entre él mismo y el 1
        //Indicador
        //7 --> 7/6 resto !=0, 7/5 resto !=0, 7/4 resto !=0, ...
        //Si algún resto da == 0, significa que NO es primo

        boolean esPrimo = true; //Indicador se pone a true, si encuentro un divisor a false
        int numero = 9;
        int resto = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El " + numero + " es primo");
        } else {
            System.out.println("El " + numero + " no es primo");
        }





    }
}
