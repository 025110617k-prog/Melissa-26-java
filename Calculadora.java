import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = s.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = s.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : 0;
        System.out.println("\n RESULTADOS ");
        System.out.printf("Suma: %.2f + %.2f = %.2f%n", num1, num2, suma);
        System.out.printf("Resta: %.2f - %.2f = %.2f%n", num1, num2, resta);
        System.out.printf("Multiplicación: %.2f * %.2f = %.2f%n", num1, num2, multiplicacion);
        System.out.printf("División: %.2f / %.2f = %.2f%n", num1, num2, division);
        s.close();
    }
}