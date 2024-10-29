package Tema2.IfYElse;

import java.util.Scanner;

public class EjercicioIfElse {

    public static void main(String[] args) {

        //Pedir por teclado la hora del día (0-23)
        //6-12 Buenos días
        //12-20 Buenas tardes
        //EN otro caso, Buenas noches

        //Pedir nivel del jugador (1-5)
        //1.Iniciado
        //2.Amateur
        //3.Profesional
        //4.Experto
        //5.Dios

        //Buenos días jugador de nivel Iniciado
        //Buenas tardes jugador de nivel Experto
        //....

        int hora, nivel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime que hora es:");
        hora = sc.nextInt();
        System.out.println("Dime tu nivel:");
        nivel = sc.nextInt();

        if (hora >6 && hora<12) {
            if (nivel == 1) {
                System.out.println("Buenos días jugador de nivel Iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenos días jugador de nivel Amateur");
            } else if (nivel == 3) {
                System.out.println("Buenos días jugador de nivel Profesional");
            } else if (nivel == 4) {
                System.out.println("Buenos días jugador de nivel Experto");
            } else if (nivel == 5) {
                System.out.println("Buenos días jugador de nivel Dios");
            } else {
                System.out.println("Error");
            }
        }

        else if (hora >=12 && hora<20) {
            if (nivel == 1) {
                System.out.println("Buenas tardes jugador de nivel Iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenas tardes jugador de nivel Amateur");
            } else if (nivel == 3) {
                System.out.println("Buenas tardes jugador de nivel Profesional");
            } else if (nivel == 4) {
                System.out.println("Buenas tardes jugador de nivel Experto");
            } else if (nivel == 5) {
                System.out.println("Buenas tardes jugador de nivel Dios");
            } else {
                System.out.println("Error");
            }
        }

        else {
            if (nivel == 1) {
                System.out.println("Buenas noches jugador de nivel Iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenas noches jugador de nivel Amateur");
            } else if (nivel == 3) {
                System.out.println("Buenas noches jugador de nivel Profesional");
            } else if (nivel == 4) {
                System.out.println("Buenas noches jugador de nivel Experto");
            } else if (nivel == 5) {
                System.out.println("Buenas noches jugador de nivel Dios");
            } else {
                System.out.println("Error");
            }
        }






    }
}
