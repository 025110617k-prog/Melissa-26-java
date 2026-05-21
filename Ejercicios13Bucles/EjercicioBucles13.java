package Ejercicios13Bucles;
public class EjercicioBucles13 {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        System.out.println("Números entre " + inicio + " y " + fin + " de 7 en 7:");
        for (int i = inicio; i <= fin; i += 7) {
            System.out.println(i);
        }
    }
}