package EjerciciosNumerosAleatorios;
public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            // Multiplicamos por 11 para que el rango vaya de 0 a 10.999...
            int numero = (int)(Math.random() * 11);
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}