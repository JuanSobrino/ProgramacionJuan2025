package EjerciciosIntroduccion;

public class Ejercicio15Practica {

    public static void main(String[] args) {

    //Tengo 2000€ en el banco
    //Interés a recibir 2.75% anual ---> 2000 * 2.75 / 100 ---> 2000 * 2.75 / 100 / 2 semestral
    //De estos intereses hacienda se lleva el 18%

    //¿Cuánto dinero me generan esos 2000€ a los 6 meses?

    double dinero = 2000;
    double interesGenerado = 2000 * 2.75 / 100; //Interés anual
    interesGenerado = interesGenerado / 2; //Interés de seis meses

    System.out.println("El banco me da de interés " + interesGenerado);

    double retencionHacienda = interesGenerado * 18 / 100;

    System.out.println("Al restar la retención se queda " + (interesGenerado - retencionHacienda));


    }
}
