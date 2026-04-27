import java.util.Scanner;
public class SolesAEuros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad de soles: ");
        double soles = s.nextDouble();
        double euros = soles / 4.05;
        System.out.println(soles + " soles son " + euros + " euros");
        s.close();
    }
}