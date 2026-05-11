import java.util.Scanner;
public class EurosASoles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros: ");
        double euros = s.nextDouble();
        double soles = euros * 4.05;
        System.out.println(euros + " euros son " + soles + " soles");
        s.close();
    }
}