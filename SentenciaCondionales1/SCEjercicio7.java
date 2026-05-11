package SentenciaCondionales1;
public class SCEjercicio7 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que diga si un número introducido por teclado
         * es par y/o divisible entre 5.
         */

        System.out.print("Introduzca un número: ");
        String line = System.console().readLine();
        double numero = Double.parseDouble(line);

        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("El número " + (int)numero + " es PAR y DIVISIBLE entre 5");
        } else if (numero % 2 == 0) {
            System.out.println("El número " + (int)numero + " es PAR");
        } else if (numero % 5 == 0) {
            System.out.println("El número " + (int)numero + " es DIVISIBLE entre 5");
        } else {
            System.out.println("El número " + (int)numero + " NO es PAR ni DIVISIBLE entre 5");
        }
    }
}