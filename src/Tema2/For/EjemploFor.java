package Tema2.For;

import java.util.Scanner;

public class EjemploFor {

    public static void main(String[] args) {

        /*
        //Pintar números del 1 al 10
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        for (int num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        //Pintar números pares del 2 al 40
        for (int num = 2; num <= 40; num+=2) {
            System.out.println(num);
        }

        //Recorrer la cadena caracter a caracter
        String cadena = "Programación";
        for (int i = 0; i < cadena.length(); i++) { //0 - 11
            System.out.println(cadena.charAt(i)); //Pinta la posición i de la cadena
        }

        //Con un for pinta una cuenta atrás del 10 al 1
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        //Genera 10 tiradas de un dado usando for
        int tirada;
        for (int i = 1; i <= 10; i++) { //Repetir algo 10 veces
            tirada = (int) (Math.random() * (6)) + 1;
            System.out.println(tirada);
        }

        //Pregunta por teclado 5 nombres de persona
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime 5 nombres de persona");
            sc.nextLine();
        }

        //Pregunta por teclado 5 nombres y pintalos seguidos
        //Tenemos que ir guardando los nombres en una variable de cadena
        //nombres = nombres + nuevo;
        Scanner sc = new Scanner(System.in);
        String nombre;
        String cadenaNombre = ""; //Iniciar cadena vacía
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime 5 nombres de persona");
            nombre = sc.nextLine();
            cadenaNombre = cadenaNombre + nombre + " ";
        }

        System.out.println(cadenaNombre);

        //Pinta por pantalla la tabla de multiplicar del 7
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x7=" + (i*7));
        }
         */

        //Pinta la tabla del 4 al revés
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "x4=" + (i*4));
        }
























    }
}
