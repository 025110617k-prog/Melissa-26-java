package Ejercicios5Array;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println(" Introduce 10 numeros enteros");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        int primerNumero = num[0];
        int ultimoNumero = num[num.length - 1];

        num[0] = ultimoNumero; // El último va al principio
        num[num.length - 1] = primerNumero; // El primero va al final
        System.out.println("El arreglo modificado es:");
        for (int numero : num) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}