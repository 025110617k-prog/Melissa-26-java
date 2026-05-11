package SentenciaCondionales1;

public class SCEjercicio2 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que resuelva una ecuación de primer grado
         * (del tipo ax + b = 0)
         */

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        
        System.out.print("Por favor, introduzca el valor de a: ");
        String lineA = System.console().readLine();
        double a = Double.parseDouble(lineA);
        
        System.out.print("Ahora introduzca el valor de b: ");
        String lineB = System.console().readLine();
        double b = Double.parseDouble(lineB);

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
