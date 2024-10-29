package Tema2.For;

public class Factorial {

    public static void main(String[] args) {

        //Calcular el factorial de un número. Que es el producto de todos los números anteriores a él hasta el 1
        //Factorial
        //5! = 5 * 4 * 3 * 2 * 1
        //8! = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

        int factorial = 8;
        long total = 1;

        for(int i = 8; i >= 2; i--) {
            total = total * i;
            System.out.println("Factorial: " + i + " " +(i*total));
        }
        System.out.println("El factorial es: " + total);














    }
}
