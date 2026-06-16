package ArrayBidimensionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la posición del alfil (ej. d5): ");
        String posicion = s.next().toLowerCase();

        // Convertimos la columna ('a'-'h') y la fila ('1'-'8') a índices numéricos
        // (0-7)
        int alfilColumna = posicion.charAt(0) - 'a';
        int alfilFila = posicion.charAt(1) - '1';

        System.out.print("El alfil puede moverse a las siguientes posiciones: ");

        // Simulación de que el sistema "piensa" los movimientos con un pequeño retardo
        Thread.sleep(800);

        // Recorremos el tablero completo de 8 filas por 8 columnas
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {

                // Condición indispensable: No evaluar la casilla actual donde ya está el alfil
                if (f == alfilFila && c == alfilColumna) {
                    continue;
                }

                // Regla del Alfil: Si el valor absoluto de la resta de las filas
                // es igual al de las columnas, significa que están en la misma diagonal.
                if (Math.abs(f - alfilFila) == Math.abs(c - alfilColumna)) {

                    // Convertimos las coordenadas numéricas de vuelta a formato Ajedrez
                    char letraColumna = (char) ('a' + c);
                    int numeroFila = f + 1;

                    // Imprimimos el resultado formateado
                    System.out.printf("%c%d ", letraColumna, numeroFila);
                }
            }
        }
        System.out.println(); // Salto de línea final
        s.close();
    }
}