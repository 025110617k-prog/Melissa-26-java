package EjerciciosNumerosAleatorios;

public class Ejercicio5 {

    public static void main(String[] args) {
        int numero;
        int contador = 0;
        do {
            // Genera entre 0 y 50, y al duplicarlo se vuelve par entre 0 y 100
            numero = (int)(Math.random() * 51) * 2;
            System.out.print(numero + " ");
            contador++;
        } while (numero != 24);
        
        System.out.println("\nSe han generado " + contador + " números en total.");
    }
}