package Tema2.IfYElse;

public class EjemploIFPizarra {

    public static void main(String[] args) {

        int edad = 45;
        char sexo = 'h';

        if (sexo == 'h') {
        if (edad >=1 && edad <=11) {
            System.out.println("Hola niño");
        }
        if (edad >=12 && edad <=17) {
            System.out.println("Hola chaval");
        }
        if (edad >=18 && edad <=29) {
            System.out.println("Hola tío");
        }
        if (edad >=30 && edad <=60) {
            System.out.println("Hola hombre");
        }
        if (edad >60) {
            System.out.println("Hola abuelo");
        }
        }

        if (sexo == 'm') {
            if (edad >=1 && edad <=11) {
                System.out.println("Hola niña");
            }
            if (edad >=12 && edad <=17) {
                System.out.println("Hola chavala");
            }
            if (edad >=18 && edad <=29) {
                System.out.println("Hola tía");
            }
            if (edad >=30 && edad <=60) {
                System.out.println("Hola mujer");
            }
            if (edad >60) {
                System.out.println("Hola abuela");
            }
        }



    }
}
