package ArrayBidimensionales;
public class Ejercicio4 {
      public static void main(String[] args) throws InterruptedException {
        int[][] num = new int[4][5];
        int f, c;

        // 1. Rellenar la matriz con números aleatorios (valores entre 100 y 999)
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                num[f][c] = (int) (Math.random() * 900) + 100;
            }
        }

        // 2. Imprimir la matriz y calcular la suma parcial de las filas
        int sumaFila;
        for (f = 0; f < 4; f++) {
            sumaFila = 0;
            for (c = 0; c < 5; c++) {
                // Aquí NO hay retardo, los números de la fila salen de golpe
                System.out.printf("%7d    ", num[f][c]);
                sumaFila = sumaFila + num[f][c];
            }
            
            // EL RETARDO ESTÁ AQUÍ: El ordenador se queda "pensando" antes de mostrar el total de la fila
            Thread.sleep(1000); 
            System.out.printf("|%7d\n", sumaFila);
        }

        // Dibujar las líneas divisorias de las columnas
        for (c = 0; c < 5; c++) {
            System.out.print("---------");
        }
        System.out.println("----------");

        // 3. Calcular la suma parcial de las columnas y el Gran Total
        int sumaColumna;
        int sumaTotal = 0;
        for (c = 0; c < 5; c++) {
            sumaColumna = 0;
            for (f = 0; f < 4; f++) {
                sumaColumna = sumaColumna + num[f][c];
            }
            sumaTotal = sumaTotal + sumaColumna;
            
            // EL RETARDO ESTÁ AQUÍ: El ordenador se queda "pensando" antes de mostrar el total de cada columna
            Thread.sleep(1000); 
            System.out.printf("|%7d   ", sumaColumna);
        }
        
        // Pausa final antes de revelar el Gran Total acumulado en la esquina
        Thread.sleep(1500); 
        System.out.printf("|%7d   \n", sumaTotal);
    }
}