package EjerciciosNumerosAleatorios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroSecreto = (int)(Math.random() * 101);
        int intentos = 5;
        boolean adivinado = false;
        
        System.out.println("He pensado un número entre 0 y 100. ¡Intenta adivinarlo!");
        
        while (intentos > 0 && !adivinado) {
            System.out.print("Introduce tu número: ");
            int numeroUsuario = s.nextInt();
            intentos--;
            
            if (numeroUsuario == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Enhorabuena! Has acertado el número.");
            } else if (intentos > 0) {
                if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número secreto es MAYOR.");
                } else {
                    System.out.println("El número secreto es MENOR.");
                }
                System.out.println("Te quedan " + intentos + " oportunidades.");
            }
        }
        
        if (!adivinado) {
            System.out.println("Lo siento, te has quedado sin intentos. El número era: " + numeroSecreto);
        }
    }
}