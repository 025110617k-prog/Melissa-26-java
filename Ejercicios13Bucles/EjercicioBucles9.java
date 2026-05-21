package Ejercicios13Bucles;
public class EjercicioBucles9 {
    public static void main(String[] args) {
        System.out.print("Introduce un número inicial: ");
        int inicio = Integer.parseInt(System.console().readLine());
        
        System.out.println("Nº\tCuadrado\tCubo");
        for (int i = 0; i < 5; i++) {
            int n = inicio + i;
            System.out.println(n + "\t" + (n * n) + "\t\t" + (n * n * n));
        }
    }
}