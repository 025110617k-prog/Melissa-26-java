package Ejercicios5Array;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Introduce 10 números enteros:");
     
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
            
            if (num[i] > maximo) {
                maximo = num[i];
            }
            if (num[i] < minimo) {
                minimo = num[i];
            }
        } 
        
        System.out.println("\nResultados:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (num[i] == maximo) {
                System.out.print(" máximo");
            }
            if (num[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println(); 
        }
    }
}