package SentenciaCondionales1;
public class SCEjercicio6 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que ordene tres números enteros
         * introducidos por teclado.
         */

        System.out.print("Introduzca primer número: ");
        String line1 = System.console().readLine();
        int n1 = Integer.parseInt(line1);
        
        System.out.print("Introduzca segundo número: ");
        String line2 = System.console().readLine();
        int n2 = Integer.parseInt(line2);
        
        System.out.print("Introduzca tercer número: ");
        String line3 = System.console().readLine();
        int n3 = Integer.parseInt(line3);

        int menor, medio, mayor;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                mayor = n3;
            } else {
                medio = n3;
                mayor = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                mayor = n3;
            } else {
                medio = n3;
                mayor = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                mayor = n2;
            } else {
                medio = n2;
                mayor = n1;
            }
        }

        System.out.println("Los números ordenados son: " + menor + " " + medio + " " + mayor);
    }
}
