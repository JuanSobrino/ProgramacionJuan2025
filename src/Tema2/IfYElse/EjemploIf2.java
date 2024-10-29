package Tema2.IfYElse;

public class EjemploIf2 {

    public static void main(String[] args) {

        //Personaje tiene vida y tiene maná
        //Si la vida es menor de 50 pinta que tiene que tomar una poción de vida
        //Si el maná es menor de 50 pinta que tiene que tomar una poción de maná
        //Si la vida es menor de 50 y el maná es menor de 50 que pinte "CORRE"

        int vidaPersonaje = 50;
        int manaPersonaje = 33;

        if (vidaPersonaje <= 50) {
            System.out.println("Toma poción de vida");
        }
        if (manaPersonaje <= 50) {
            System.out.println("Toma poción de maná");
        }
        if (vidaPersonaje < 50 && manaPersonaje < 50) {
            System.out.println("CORRE");
        }


    }
}
