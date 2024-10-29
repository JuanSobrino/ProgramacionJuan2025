package Tema1;

public class PrecioIva {

    public static void main(String[] args) {

        //Datos de entrada: precioProducto
        //Datos de salida: precioFinal
        //DECLARACIÓN DE VARIABLES

        double precioProducto = 69.95;
        double precioFinal = 0;

        precioFinal = precioProducto + (21 * precioProducto / 100);

        System.out.println("El precio con IVA es " + precioFinal);

    }
}