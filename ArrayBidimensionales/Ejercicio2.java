package ArrayBidimensionales;
public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5]; 
        int fila, columna;
        System.out.println("Por favor, introduce 20 números enteros:");
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", Columna " + columna + ": ");
                matriz[fila][columna] = Integer.parseInt(System.console().readLine());
            }
        }
        
        System.out.println("\n--- HOJA DE CÁLCULO ---");
        int sumaTotal = 0;
        for (fila = 0; fila < 4; fila++) {
            int sumaFila = 0;
            
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%10d", matriz[fila][columna]);
                sumaFila += matriz[fila][columna]; 
            }
            System.out.printf(" | %10d\n", sumaFila);
            sumaTotal += sumaFila; 
        }
        for (columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-------------");
      
        for (columna = 0; columna < 5; columna++) {
            int sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += matriz[fila][columna]; 
            }
            System.out.printf("%10d", sumaColumna);
        }
        System.out.printf(" | %10d\n", sumaTotal);
    }
}