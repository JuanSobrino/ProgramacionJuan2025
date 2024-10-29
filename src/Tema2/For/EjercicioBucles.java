package Tema2.For;

import java.util.Scanner;

public class EjercicioBucles {

    public static void main(String[] args) {

        //Hay que pedir números hasta que introduzcamos el cero
        //El resultado es la suma y la media de los números introducidos
        //Acumulador (la suma) y contador (el total de numeros introducidos)

        //6,7,10,11,1 ---> Suma = 35, Media = 35 / 5

        Scanner sc = new Scanner(System.in);

        int numero = -1;
        int suma = 0; //acumulador
        int contador = 0; //contador

        do {
            System.out.println("Escribe un número");
            numero = sc.nextInt();

            //Sumarlo en el acumulador si es el número de salida
            //El 0 no se puede contar para la media
            if (numero != 0) {
            suma += numero;
            contador++;
            }
        } while (numero != 0);

        System.out.println("La suma es " + suma + " y la media es " + (suma/contador));












    }
}
