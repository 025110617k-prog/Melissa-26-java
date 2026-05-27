package EjerciciosNumerosAleatorios;
public class Ejercicio3 {
    public static void main(String[] args) {
        int maximo = 100; // Límite inferior inicial
        int minimo = 199; // Límite superior inicial
        int suma = 0;
        
        System.out.println("Los 50 números aleatorios:");
        for (int i = 1; i <= 50; i++) {
            int numero = (int)(Math.random() * 100) + 100;
            System.out.print(numero + " ");
            
            // Cálculos estadísticos
            suma += numero;
            if (numero > maximo) { maximo = numero; }
            if (numero < minimo) { minimo = numero; }
        }
        
        double media = (double) suma / 50;
        
        System.out.println("\n\n--- Estadísticas ---");
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);
    }   
}