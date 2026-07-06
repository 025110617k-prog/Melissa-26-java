package ArrayBidimensionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la posición del alfil (ej. d5): ");
        String posicion = s.next().toLowerCase();


        int alfilColumna = posicion.charAt(0) - 'a';
        int alfilFila = posicion.charAt(1) - '1';

        System.out.print("El alfil puede moverse a las siguientes posiciones: ");


        Thread.sleep(800);

        
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {

               
                if (f == alfilFila && c == alfilColumna) {
                    continue;
                }

        
                if (Math.abs(f - alfilFila) == Math.abs(c - alfilColumna)) {

                
                    char letraColumna = (char) ('a' + c);
                    int numeroFila = f + 1;

              
                    System.out.printf("%c%d ", letraColumna, numeroFila);
                }
            }
        }
        System.out.println(); 
        s.close();
    }
}