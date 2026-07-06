public class Matematicas {

    //Funcion que realiza la operacion de suma de 2 variables
    public static double suma(double a, double b) {
        return a + b;
    }

    //Funcion que realiza la operacion de resta de 2 variables
    public static double resta(double x, double y) {
        return x - y;
    }

    //Funcion que realiza la operacion de multiplicacion de 2 variables
    public static double multiplicacion(double x, double y) {
        return x * y;
    }

    //Funcion que realiza la operacion de división de 2 variables
    public static double division(double x, double y) {
        if (y == 0) {
            return 0;
    } else{
        return x / y;
       }
    }
}
