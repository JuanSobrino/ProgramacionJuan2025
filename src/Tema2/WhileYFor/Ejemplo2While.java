package Tema2.WhileYFor;

public class Ejemplo2While {

    public static void main(String[] args) {

        //Simula lanzar un dado de seis caras, hasta que te salga un seis
        //Generar un número aleatorio del 1 al 6

        /*
        int tirada = -1;

        while (tirada != 6) {
            tirada = (int) (Math.random() * (6 - 1 + 1)) + 1;
            System.out.println(tirada);
        }

        //Simula lanzar un dado de seis caras, hasta que te salga un seis
        //Cuenta el número de tiradas que has necesitado hasta sacar un seis
        //Necesito una variable que se incremente cada vez que entro en el while

        int tirada = 0;
        int contador = 0;

        while (tirada != 6) {
            tirada = (int) (Math.random() * (6 - 1 + 1)) + 1;
            System.out.println(tirada);
            contador++;
        }

        System.out.println("Has necesitado " + contador + " tiradas");

         */

        //Simula lanzar un dado de veinte caras, hasta que te salga un el 1 o el 20

        int tirada = 0;
        int contador = 0;

        do {
            tirada = (int) (Math.random() * (20 - 1 + 1)) + 1;
            System.out.println(tirada);
            contador++;
        } while (tirada != 1 && tirada != 20);

        System.out.println("Ha habido " + contador + " tiradas");




    }
}
