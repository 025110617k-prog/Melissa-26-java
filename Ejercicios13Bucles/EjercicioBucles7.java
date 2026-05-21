package Ejercicios13Bucles;
public class EjercicioBucles7 {
    public static void main(String[] args) {
        int combinacion = 1234;
        int intento;
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("Introduce combinación (intento " + i + "): ");
            intento = Integer.parseInt(System.console().readLine());
            
            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}