package Ejercios13Bucles;
public class EjercicioBucles12 {

    public static void main(String[] args) {
        int numero;
        
        do {
            System.out.print("Introduce un número positivo: ");
            numero = Integer.parseInt(System.console().readLine());
        } while (numero <= 0);
        
        long suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += (numero + i);
        }
        
        System.out.println("La suma es: " + suma);
    }
}