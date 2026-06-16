package ArrayBidimensionales;
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] num = new int[6][10];
        int f, c;
        int propuesta;
        boolean repetido;

        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                // Generar números hasta encontrar uno que no esté repetido
                do {
                    propuesta = (int) (Math.random() * 1001);
                    repetido = false;
                    
                    // Comprobar si el número ya existe en lo que va de matriz
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (num[i][j] == propuesta) {
                                repetido = true;
                            }
                        }
                    }
                } while (repetido);
                
                num[f][c] = propuesta;
            }
        }

        // Mostrar la matriz y buscar máximos/mínimos (Igual al Ejercicio 5)
        int maximo = num[0][0]; int minimo = num[0][0];
        int filaMax = 0, colMax = 0, filaMin = 0, colMin = 0;

        for (f = 0; f < 6; f++) {
            for (c = 0; c < 10; c++) {
                System.out.printf("%5d ", num[f][c]);
                if (num[f][c] > maximo) { maximo = num[f][c]; filaMax = f; colMax = c; }
                if (num[f][c] < minimo) { minimo = num[f][c]; filaMin = f; colMin = c; }
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------------------------------");
        System.out.printf("MÁXIMO (Sin repetir): %d en Fila %d, Columna %d.\n", maximo, filaMax, colMax);
        System.out.printf("MÍNIMO (Sin repetir): %d en Fila %d, Columna %d.\n", minimo, filaMin, colMin);
    }
}