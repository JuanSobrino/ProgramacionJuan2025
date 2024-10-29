package Tema2.CubitusHumerus;

public class CubitusHumerus1 {

    public static void main(String[] args) {

        //Dos romanos asediando una ciudad, están aburridos y se ponen a jugar a los dados
        //Cada uno tira un dado de 20 caras
        //Gana el que saca el dado mayor, o el que saca un 9
        //Juega una partida y dime quien gana
        //Si juegan 10 partidas dime quién gana de los dos (el que gana más partidas)

        //1. Saca 9 Humerus y Cubitus !=9 -> Gana A
        //2. Saca 9 Cubitus y Humerus !=9 -> Gana B
        //3. Sacan 9 los dos -> Empate
        //4.1 Sacan !=9 los dos y Humerus > Cubitus -> Gana A
        //4.2 Sacan !=9 los dos y Cubitus > Humerus -> Gana B
        //4.2 Sacan !=9 los dos y Cubitus == Humerus -> Empate

        int tiradaH;
        int tiradaC;
        int contadorGanaH = 0;
        int contadorGanaC = 0;

        for (int i=0; i<10; i++) {
            tiradaH = (int) (Math.random() * 20) + 1;
            tiradaC = (int) (Math.random() * 20) + 1;
            System.out.println("TiradaH " + tiradaH);
            System.out.println("TiradaC " + tiradaC);

            if ((tiradaH == 9) && (tiradaC != 9)) {
                System.out.println("Gana Humerus");
                contadorGanaH++;
            } else if ((tiradaC == 9) && (tiradaH != 9)) {
                System.out.println("Gana Cubitus");
                contadorGanaC++;
            } else if ((tiradaC == 9) && (tiradaH == 9)) {
                System.out.println("Empate");
            } else if ((tiradaC > tiradaH)) {
                System.out.println("Gana Humerus");
                contadorGanaH++;
            } else if ((tiradaH > tiradaC)) {
                System.out.println("Gana Cubitus");
                contadorGanaC++;
            } else if ((tiradaH == tiradaC)) {
                System.out.println("Empate");
            }
        }

        System.out.println("Partidas Cubitus " + contadorGanaC);
        System.out.println("Partidas Humerus " + contadorGanaH);

        if (contadorGanaC > contadorGanaH) {
            System.out.println("Ganador total Cubitus");
        } else if (contadorGanaH > contadorGanaC) {
            System.out.println("Ganador total Humerus");
        } else {

        }









    }
}
