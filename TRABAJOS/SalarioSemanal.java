import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Horas trabajadas en la semana: ");
        double horas = s.nextDouble();
        double salario = horas * 12;
        System.out.println("\n=== SALARIO SEMANAL ===");
        System.out.printf("Horas trabajadas: %.1f h%n", horas);
        System.out.printf("Tarifa: S/ 12.00 por hora%n");
        System.out.printf("Salario total: S/ %.2f%n", salario);
        s.close();
    }
}