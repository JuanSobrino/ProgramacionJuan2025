package EjerciciosIntroduccion;

import java.time.Month;

public class Ejercicio17Practica {

    public static void main(String[] args) {

        //Generar números entre max y min --> (int) (Math.random() * (max - min + 1) + min);

        //a.Crear un número entero positivo aleatorio entre 1 y 49.
        int apartadoA = (int) (Math.random() * (49 - 1 + 1) + 1);
        System.out.println(apartadoA);

        //c.Generar un número real aleatorio entre 1 y 10.
        double apartadoC = Math.random() * 10 + 1;
        System.out.println(apartadoC);

        //e.Crear un número entero entre -100 y 100.
        int apartadoE = (int) (Math.random() * (100 - (-100) + 1) - 100);
        System.out.println(apartadoE);

        //f.Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        int apartadoF = (int) (Math.random() * (5 - 1 + 1) + 1);
        System.out.println(apartadoF);

        //g.Crea un generador aleatorio de uno de los meses del año
        int apartadoG = (int) (Math.random() * (12 - 1 + 1) + 1);
        System.out.println(Month.of(apartadoG));


    }
}
