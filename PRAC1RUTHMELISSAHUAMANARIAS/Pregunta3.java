package PRAC1RUTHMELISSAHUAMANARIAS;
public class Pregunta3 {
    public static void main(String[] args) {

        String line;
        double edad;
        double precio;

        precio = 7;

        System.out.print("Ingrese edad: ");
        line = System.console().readLine();
        edad = Double.parseDouble(line);

        if (edad < 5) {

            precio = precio - (precio * 0.60);

        } else if (edad > 60) {

            precio = precio - (precio * 0.55);

        } else {

            precio = 7;
        }

        System.out.println("Precio: " + precio);
    }
}