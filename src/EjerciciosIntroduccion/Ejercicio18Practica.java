package EjerciciosIntroduccion;

public class Ejercicio18Practica {

    public static void main(String[] args) {

        //18. ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
        //corríjalos y dé una explicación de por qué suceden.

        int a = 10, b = 3 , c = 1, d, e; //Había dos e declaradas, hay que sustituirlo por c
        float x, y;
        x= a / b;
        //c = a < b && c; //No puedo comparar un boolean con un entero
        d = a + b++;
        e = ++a - b;
        y = (float)a / b;
    }
}
