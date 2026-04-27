import java.util.Scanner;
public class AreaDelRectangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Introduce la Base del Rectangulo: ");
        numero1 = s.nextInt();
        System.out.print("Introduce el Altura del Rectangulo: ");
        numero2 = s.nextInt();
        int arearectangulo;
        arearectangulo = numero1 * numero2;
        System.out.println("El Área del Rectangulo es: " + arearectangulo);
        s.close();
    }
}