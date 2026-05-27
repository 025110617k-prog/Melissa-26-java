package EjerciciosNumerosAleatorios;
public class Ejercicio1 {
    public static void main(String[] args) {
        // Generar el palo (1 a 4)
        int numeroPalo = (int)(Math.random() * 4) + 1;
        String palo = "";
        
        switch(numeroPalo) {
            case 1: palo = "picas"; break;
            case 2: palo = "corazones"; break;
            case 3: palo = "diamantes"; break;
            case 4: palo = "tréboles"; break;
        }
        
        // Generar la carta (1 a 13)
        int numeroCarta = (int)(Math.random() * 13) + 1;
        String carta = "";
        
        switch(numeroCarta) {
            case 1: carta = "A"; break;
            case 11: carta = "J"; break;
            case 12: carta = "Q"; break;
            case 13: carta = "K"; break;
            default: carta = String.valueOf(numeroCarta);
        }
        
        System.out.println("Carta generada: " + carta + " de " + palo);
    }
}