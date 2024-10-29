package Tema2.Excepciones;

import java.util.Scanner;

public class EjemploCapturaExcepcion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean error = true;
        while (error == true) {
            System.out.println("Dame un número");

            //Controlar errores
            try {
                //Intento ejecutar todo este código
                int numero = sc.nextInt();
                error = false;
            } catch (NumberFormatException ex) {
                //Si hay una excepción se ejecuta este código y no salta el error
                System.out.println("No has introducido un número válido");
            } catch (Exception ex) {
                System.out.println("Otro error");
            }
        }






    }
}
