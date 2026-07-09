public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("--- NÚMEROS PRIMOS DEL 1 AL 1000 ---");
        int contadorLinea = 0;
        for (int i = 1; i <= 1000; i++) {
            if (FuncionesMatematicas.esPrimo(i)) {
                System.out.print(i + "\t");
                contadorLinea++;
                if (contadorLinea % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}