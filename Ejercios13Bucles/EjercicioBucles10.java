package Ejercios13Bucles;
public class EjercicioBucles10 {
    public static void main(String[] args) {
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = Integer.parseInt(System.console().readLine());
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}