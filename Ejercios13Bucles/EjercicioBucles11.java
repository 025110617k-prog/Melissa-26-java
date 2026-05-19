package Ejercios13Bucles;
public class EjercicioBucles11 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        
        boolean esPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
