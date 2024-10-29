package Tema2.WhileYFor;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {

        /*
        //Pinta los números del 1 al 50
        int numero = 1;
        while (numero <= 50) {
            System.out.println(numero);
            numero = numero + 1;
        }

        //Pinta los números pares del 1 al 20
        numero = 2;
        while (numero <= 20) {
            System.out.println(numero);
            numero+=2;   //numero = numero + 2;
        }

        //Cuenta atrás del 10 al 1
        numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero-=1;
        }

        //Muestre los números que son decenas del 1 al 100
        numero = 10;
        while (numero <= 100) {
            System.out.println(numero);
            numero+=10;
        }

        //Otra manera de ver los números que son decenas del 1 al 100
        numero = 1;
        while (numero <= 100) {
            if (numero % 10 == 0) { //Comprobar si el número es o no múltiplo de 10
                System.out.println(numero);
            }
            numero++; // numero = numero + 1
        }

        //Del 1 al 200 muestra los números impares que no sean múltiplos de 7
        //Impares --> numero % 2 != 0
        //Múltiplos --> numero % 7 != 0
        numero = 1;
        while (numero <= 200) {
            if (numero % 2 != 0 && numero % 7 != 0) {
                //System.out.println(numero);
            }
            numero++;
        }

        //Pide por teclado una contraseña mientras la longitud sea menor de 8 caracteres
        //password.length() --> devuelve la longitud del String password
        String password = "1";
        Scanner sc = new Scanner(System.in);

        while (password.length()<8) {
            System.out.println("Introduce tu contraseña");
            password = sc.nextLine(); //Lo que nos acerca a que se cumpla es pedir por teclado
        }

        System.out.println("Tu contraseña válida es " + password);

         */

        //Pida por teclado una contraseña mientras la longitud sea menor de 10 caracteres
        //Y que tenga al menos una letra mayúscula
        //password.toUpperCase() pasa la cadena a mayúsculas
        //password.toLowerCase() pasa la cadena a minúsculas

        String password = "hola";
        Scanner sc = new Scanner(System.in);

        //Mientras pass sea igual a passMinuscula Y pass sea menor que 10
        while (password.length()<10 || (password.equals(password.toLowerCase()) ) ) {
            System.out.println("Introduce la contraseña");
            password = sc.nextLine(); //Lo que nos acerca a que se cumpla es pedir por teclado
        }
        System.out.println("Tu contraseña válida es " + password);

        //Lo que yo quiero es que el bucle termine cuando --> password.length() >= 10 && !password.equals(password.toLowerCase())
        //Así que en while se repite lo contrario, ya que quieres que el bucle continúe
        //password.length() < 10 || password.equals(password.toLowerCase())















    }
}
