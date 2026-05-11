import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double base = s.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double altura = s.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("\n ÁREA DEL TRIÁNGULO \n");
        System.out.printf("Base: %.2f | Altura: %.2f\n", base, altura);
        System.out.printf("Área = (%.2f * %.2f) / 2 = %.2f\n", base, altura, area);
        s.close();
    }
}