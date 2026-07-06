package ArrayBidimensionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        // Usamos la misma estructura de tu array original (4 filas por 5 columnas)
        int[][] tablero = new int[4][5];
        int f, c;

        // Inicializamos el tablero en 0 (Casillas vacías)
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                tablero[f][c] = 0;
            }
        }

        // Colocar el Tesoro (representado por un 1) de forma aleatoria
        int tesoroFila = (int) (Math.random() * 4);
        int tesoroColumna = (int) (Math.random() * 5);
        tablero[tesoroFila][tesoroColumna] = 1;

        // Colocar la Mina (representada por un 2) en una posición libre
        int minaFila, minaColumna;
        do {
            minaFila = (int) (Math.random() * 4);
            minaColumna = (int) (Math.random() * 5);
        } while (minaFila == tesoroFila && minaColumna == tesoroColumna);
        tablero[minaFila][minaColumna] = 2;

        boolean juegoActivo = true;
        System.out.println("=== ¡BUSCA EL TESORO EN LA MATRIZ DE 4x5! ===");

        while (juegoActivo) {
            System.out.print("Introduce la fila (0-3): ");
            int disparoFila = s.nextInt();
            System.out.print("Introduce la columna (0-4): ");
            int disparoColumna = s.nextInt();

            // Pequeño efecto de retardo como en tu código original
            Thread.sleep(600);

            if (disparoFila == tesoroFila && disparoColumna == tesoroColumna) {
                System.out.println("¡FELICIDADES! ¡Has encontrado el tesoro en la matriz!");
                juegoActivo = false;
            } else if (disparoFila == minaFila && disparoColumna == minaColumna) {
                System.out.println("¡BOOM! Has pisado la mina. Fin del juego.");
                juegoActivo = false;
            } else {
                
                System.out.println("Casilla vacía. Sigue buscando.");
                if (Math.abs(disparoFila - minaFila) <= 1 && Math.abs(disparoColumna - minaColumna) <= 1) {
                    System.out.println("¡Cuidado! ¡Hay una mina cerca!");
                }
                System.out.println("----------------------------------------");
            }
        }
        s.close();
    }
}