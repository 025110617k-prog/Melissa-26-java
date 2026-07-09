public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("--- NÚMEROS CAPICÚA DEL 1 AL 99999 ---");
        int contadorLinea = 0;
        for (int i = 1; i <= 99999; i++) {
            if (FuncionesMatematicas.esCapicua(i)) {
                System.out.print(i + "\t");
                contadorLinea++;
                if (contadorLinea % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}