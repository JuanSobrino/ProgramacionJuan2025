package Tema2.For;

public class ContadorFor {

    public static void main(String[] args) {

        /*
        //Tira un dado de seis caras 100 veces
        //Y dime cuántas veces sale el seis

        int tirada;
        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            tirada = (int) (Math.random() * (6)) + 1;
            if (tirada == 6) {
                contador++;
            }
        }

        System.out.println("El 6 ha salido un total de " + contador + " veces");

        //Tira un dado de seis caras 100 veces
        //Y dime el porcentaje de veces que sale el seis

        int tirada;
        int contador = 0;
        for (int i = 0; i <= 10000; i++) {
            tirada = (int) (Math.random() * (6)) + 1;
            if (tirada == 6) {
                contador++;
            }
        }

        System.out.println("El 6 ha salido un " + (contador * 100 / 10000) + "%");
         */

        //Suma todos los números pares del 1 al 100
        int total = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }

        System.out.println(total);













    }
}
