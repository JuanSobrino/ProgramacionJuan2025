package Tema1;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int edad = 15;
        char sexo = 'h';

        //Y LÓGICO
        boolean condicion = (edad == 15 && sexo == 'h'); //true && true == true
        System.out.println(condicion);

        condicion = (edad >= 18 && sexo == 'h'); //false && true == false
        System.out.println(condicion);

        condicion = (edad >= 16 && sexo == 'm'); //false && false == false
        System.out.println(condicion);


        //O LÓGICO
        condicion = (edad == 15 || sexo == 'h'); //true || true == true
        System.out.println(condicion);

        condicion = (edad >= 20 || sexo == 'h'); //false || true == true
        System.out.println(condicion);

        condicion = (edad >= 25 || sexo == 'm'); //false || false == false
        System.out.println(condicion);


        //MEZCLAR ! Y,O
        condicion = !((edad >=15) && (sexo == 'm')); // (true) && (false) --> false, !false = true
        System.out.println(condicion);

        condicion = (edad >=15) && !(sexo == 'm'); // (true) && !(false) --> true && true = true
        System.out.println(condicion);

        condicion = !((edad < 10) || (sexo == 'c')); // !(false || false) --> true
        System.out.println(condicion);

        condicion = !(edad < 10) || (sexo == 'h'); // false || true --> true
        System.out.println(condicion);


    }
}
