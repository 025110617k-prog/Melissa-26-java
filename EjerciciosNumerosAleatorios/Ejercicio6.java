package EjerciciosNumerosAleatorios;

public class Ejercicio6 {
    public static void main(String[] args) throws InterruptedException {
        // Bucle infinito para llenar la pantalla (puedes detenerlo con Ctrl+C)
        while (true) {
            int codigoAscii = (int)(Math.random() * 95) + 32;
            char caracter = (char) codigoAscii;
            System.out.print(caracter);
            
            // Opcional: una pequeña pausa para simular el efecto visual progresivo
            Thread.sleep(10); 
        }
    }
}