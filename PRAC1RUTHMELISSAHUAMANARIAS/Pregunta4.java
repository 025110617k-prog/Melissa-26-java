package PRAC1RUTHMELISSAHUAMANARIAS;
public class Pregunta4 {
    public static void main(String[] args) {

        String line;
        double num;
        double menor;
        int i;

        System.out.print("Ingrese numero 1: ");
        line = System.console().readLine();
        menor = Double.parseDouble(line);

        i = 2;

        while (i <= 5) {

            System.out.print("Ingrese numero " + i + ": ");
            line = System.console().readLine();
            num = Double.parseDouble(line);

            if (num < menor) {
                menor = num;
            }

            i++;
        }

        System.out.println("El menor es: " + menor);
    }
}