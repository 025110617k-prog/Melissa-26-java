package ArrayBidimensionales;
public class Ejercicio5 {
    public static void main(String[] args) throws InterruptedException {
        int[][] num = new int[6][10];
        int f, c;

        // Rellenar la matriz de 6x10 (valores de 0 a 1000)
        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                num[f][c] = (int) (Math.random() * 1001);
            }
        }

        // Mostrar la matriz en pantalla
        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                System.out.printf("%5d ", num[f][c]);
            }
            System.out.println();
        }

        // Algoritmo para encontrar Máximo y Mínimo
        int maximo = num[0][0];
        int minimo = num[0][0];
        int filaMax = 0, colMax = 0;
        int filaMin = 0, colMin = 0;

        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                if (num[f][c] > maximo) {
                    maximo = num[f][c];
                    filaMax = f;
                    colMax = c;
                }
                if (num[f][c] < minimo) {
                    minimo = num[f][c];
                    filaMin = f;
                    colMin = c;
                }
            }
        }

        System.out.println("\n-----------------------------------------------------------");
        System.out.printf("El número MÁXIMO es %d y está en la fila %d, columna %d.\n", maximo, filaMax, colMax);
        System.out.printf("El número MÍNIMO es %d y está en la fila %d, columna %d.\n", minimo, filaMin, colMin);
    }
}