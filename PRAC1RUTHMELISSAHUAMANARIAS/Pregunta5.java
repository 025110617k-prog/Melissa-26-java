package PRAC1RUTHMELISSAHUAMANARIAS;
public class Pregunta5 {
    public static void main(String[] args) {

        String line;
        double num1;
        double num2;

        System.out.print("Ingrese primer numero: ");
        line = System.console().readLine();
        num1 = Double.parseDouble(line);

        System.out.print("Ingrese segundo numero: ");
        line = System.console().readLine();
        num2 = Double.parseDouble(line);

        if (num1 % num2 == 0) {

            System.out.println("Es divisible");

        } else {

            System.out.println("No es divisible");
        }
    }
}