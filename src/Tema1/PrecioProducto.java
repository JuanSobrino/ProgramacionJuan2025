package Tema1;

import java.util.Scanner;

public class PrecioProducto {

    public static void main(String[] args) {

        //Crea un programa que pida por teclado el precio de un producto. Pide también la cantidad de ese producto
        //que vas a comprar. Devuelve el precio final, con el IVA (21%) incluido.

        //Datos de entrada: double precioInicial, int cantidad.
        //Datos de salida: double precioFinal.

        double precioInicial = 0;
        int cantidad = 0;
        double precioFinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el precio del producto");
        precioInicial = sc.nextDouble();

        System.out.println("Dime la cantidad del producto");
        cantidad = sc.nextInt();

        precioFinal = (precioInicial * 1.21) * cantidad;
        System.out.println("El precio final es " + precioFinal);
    }
}
