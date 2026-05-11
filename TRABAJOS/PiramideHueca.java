public class PiramideHueca {
    public static void main(String[] args) {
        int base = 9;

        for (int i = 1; i <= base; i += 2) {
            int espacios = (base - i) / 2;

            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
            } else if (i == base) {
                for (int k = 1; k <= base; k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 1; k <= i - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
