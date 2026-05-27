package EjerciciosNumerosAleatorios;

public class Ejercicio7 {
    public static void main(String[] args) {
        int dado1, dado2;
        int tirada = 1;
        
        do {
            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;
            
            System.out.println("Tirada " + tirada + ": Dado [1] = " + dado1 + " | Dado [2] = " + dado2);
            tirada++;
            
        } while (dado1 != dado2);
        
        System.out.println("¡Los dados coinciden! Fin de la simulación.");
    }
}