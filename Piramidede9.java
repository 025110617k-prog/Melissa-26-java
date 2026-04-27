public class Piramidede9 {
    public static void main(String[] args) {
        int base = 9;

        for (int i = 1; i <= base; i += 2) {
            int espacios = (base - i) / 2;

            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}