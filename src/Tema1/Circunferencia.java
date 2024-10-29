package Tema1;

public class Circunferencia {
    public static void main(String[] args) {

        int radio = 0;
        double area = 0;
        double perimetro= 0;

        //Como si leyeramos de teclado
        radio = 10;

        area = Math.PI * radio * radio;
        perimetro = 2 * Math.PI  * radio;

        System.out.println("Área " + area);
        System.out.println("Perámetro = " + perimetro);


    }
}