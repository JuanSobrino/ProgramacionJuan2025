package EjerciciosIntroduccion;

import java.util.Scanner;

public class Ejercicio1OW {

        //Pedimos por teclado el coste de fabricacion de un producto
        //Queremos pintar por pantalla el precio que le vamos a poner al producto para el cliente
        //Al coste de fabricacion hay que sumarle la ganancia para el vendedor (30%)
        //Al precio resultante le tengo que sumar el IVA (21%)
        //Por último imprimo por pantalla el precio para el cliente final

    public static void main(String[] args) {

        double costeProducto;
        double precioFinal;

        //Leer de teclado el coste de fabricación
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el precio del producto");
        costeProducto = sc.nextDouble();

        //Sumarle el margen que yo me quiero quedar (30%)
        costeProducto = costeProducto * 1.3;
        System.out.println("El coste de fabricación más el margen es " + costeProducto);

        //Sumarle un 21% de IVA que le tengo que dar a Hacienda
        precioFinal = costeProducto * 1.21;
        System.out.println("El precio final para el cliente es " + precioFinal);

        //Prueba de que el GIT funciona em Windows

    }



}
