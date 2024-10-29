package Tema2.IfYElse;

import java.util.Scanner;

public class Ejercicio1Practica {

    public static void main(String[] args) {

        /*Implementa un programa en java que dada una fecha, nos indique cuál es la estación del año.
        El día del mes, y el mes del año se debe introducir como números enteros a través del teclado */

        Scanner sc = new Scanner(System.in);
        int mes, dia;

        System.out.println("Indica el día: (1-31)");
        dia = sc.nextInt();

        System.out.println("Indica el mes: (1-12)");
        mes = sc.nextInt();

        //Invierno
        if ( (dia >= 22  && dia <=31 && mes == 12) || (mes == 1) || (mes == 2) || (dia >= 1 && dia < 20 && mes == 3)){
            System.out.println("Estamos en invierno");
        }

        //Primavera
        else if ( (dia >= 20 && dia <=31 && mes == 3) || (mes == 4) || (mes == 5) || (dia >= 1 && dia < 19 && mes == 6)){
            System.out.println("Estamos en primavera");
        }

        //Verano
        else if ( (dia >= 20 & dia <= 30 && mes == 6) || (mes == 7) || (mes == 8) || (dia >= 1 && dia < 20 && mes == 9)) {
            System.out.println("Estamos en verano");
        }

        //Otoño
        else {
            System.out.println("Estamos en otoño");
        }








    }
}
