package Ejercicios5Array;
public class Ejercico5 {
    public static void main(String[] args) {
        int[] num = new int[15];
        System.out.println("Introduce 15 números enteros:");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        } 

        int ultimoNumero = num[num.length - 1];
        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        } 
        
        num[0] = ultimoNumero;
        System.out.println("\nEl array rotado es:");
        for (int numero : num) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}