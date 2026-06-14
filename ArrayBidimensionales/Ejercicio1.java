package ArrayBidimensionales;
public class Ejercicio1 {

    public static void main(String[] args) {
        int[][] num = {
            {0, 30, 2, 0, 0, 5},
            {75, 0, 0, 0, 0, 0},
            {0, 0, -2, 9, 0, 11}
        };
        
        System.out.printf("%-10s", "Array num");
        for (int c = 0; c < 6; c++) {
            System.out.printf("%10s", "Columna " + c);
        }
        System.out.println();
        for (int fila = 0; fila < 3; fila++) {
            System.out.printf("%-10s", "Fila " + fila); // Muestra la fila actual
            for (int columna = 0; columna < 6; columna++) {
                System.out.printf("%10d", num[fila][columna]); 
            }
            System.out.println();
        }
    }
}