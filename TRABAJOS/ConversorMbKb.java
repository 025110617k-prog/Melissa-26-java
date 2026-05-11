import java.util.Scanner;

public class ConversorMbKb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad en Mb: ");
        double megabytes = s.nextDouble();
        double kilobytes = megabytes * 1024;
        System.out.println("\n CONVERSOR Mb → Kb ");
        System.out.printf("%.2f Mb = %.0f Kb%n", megabytes, kilobytes);
        s.close();
    }
}