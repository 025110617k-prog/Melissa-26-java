package ArrayBidimensionales;
public class Ejercicio3 {

    public static void main(String[] args) throws InterruptedException {

        int[][] num = new int[4][5];

        int f, c;

        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                // System.out.print("num[" + f + ", " + c + "]: ");
                num[f][c] = (int) (Math.random() * 900) + 100;
            }
        }

        // Suma parcial de las filas
        int sumaFila;
        for (f = 0; f < 4; f++) {
            sumaFila = 0;
            for (c = 0; c < 5; c++) {
                System.out.printf("%7d    ", num[f][c]);
                sumaFila = sumaFila + num[f][c];
                Thread.sleep(500);
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Suma parcial de las columnas
        for (c = 0; c < 5; c++) {
            System.out.print("---------");
        }
        System.out.println("----------");
        int sumaColumna;
        int sumaTotal = 0;
        for (c = 0; c < 5; c++) {
            sumaColumna = 0;
            for (f = 0; f < 4; f++) {
                sumaColumna = sumaColumna + num[f][c];
            }
            sumaTotal = sumaTotal + sumaColumna;
            System.out.printf("|%7d   ", sumaColumna);
            Thread.sleep(500);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}
