import java.util.Scanner;
public class NotaSegundoExamen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = s.nextDouble();
        double nota2 = (notaDeseada - (nota1 * 0.4)) / 0.6;
        System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.2f en el segundo examen.%n",
                          notaDeseada, nota2);
        s.close();
    }
} 