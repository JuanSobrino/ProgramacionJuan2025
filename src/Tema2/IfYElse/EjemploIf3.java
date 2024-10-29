package Tema2.IfYElse;

public class EjemploIf3 {

    public static void main(String[] args) {

        //vidaP, magiaP, escudoEspecial (boolean)
        //Si vidaP es menor que 50 y no tiene escudo, pinta "Toma poción de vida"
        //Si no, si magiaP es menor que 50 y no tiene escudo, pinta "Toma poción de magia"
        //Si no, si vidaP es menor que 50 y magiaP es menor que 50, pinta "Tómate algo y corre"

        int vidaP = 40, magiaP = 55;
        boolean escudoEspecial = false;

        if (vidaP < 50 && escudoEspecial == false) {
            System.out.println("Toma poción de vida");
        } else if (magiaP < 50 && escudoEspecial == false) {
            System.out.println("Toma poción de magia");
        } else if (vidaP < 50 && magiaP < 50) {
            System.out.println("Tómate algo y corre");
        }



    }
}
