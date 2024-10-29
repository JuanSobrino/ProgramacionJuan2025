package Tema2.For;

public class EjercicioAcumulador2 {

    public static void main(String[] args) {

        //Genera 100 números aleatorios entre 1 y 100
        //Muestra la suma de los pares y la suma de los impares

        int numero;
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 1; i <= 100; i++) {
            numero = (int) (Math.random() * (100)) + 1;
            if (i % 2 == 0) {
                totalPares = totalPares + numero;
            } else {
                totalImpares = totalImpares + numero;
            }
        }

        System.out.println("La suma de los números pares es " + totalPares);
        System.out.println("La suma de los números impares es " + totalImpares);







    }
}
