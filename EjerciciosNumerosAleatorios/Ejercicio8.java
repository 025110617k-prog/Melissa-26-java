package EjerciciosNumerosAleatorios;

public class Ejercicio8 {
    public static void main(String[] args) {
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";

        // Simular las 3 posiciones
        for (int i = 1; i <= 3; i++) {
            int opcion = (int) (Math.random() * 5); // 0 a 4
            String figuraAsignada = "";

            switch (opcion) {
                case 0:
                    figuraAsignada = "corazón";
                    break;
                case 1:
                    figuraAsignada = "diamante";
                    break;
                case 2:
                    figuraAsignada = "herradura";
                    break;
                case 3:
                    figuraAsignada = "campana";
                    break;
                case 4:
                    figuraAsignada = "limón";
                    break;
            }

            if (i == 1)
                figura1 = figuraAsignada;
            else if (i == 2)
                figura2 = figuraAsignada;
            else
                figura3 = figuraAsignada;
        }

        // Mostrar resultado de la tirada
        System.out.println(figura1 + " " + " " + figura2 + " " + figura3);

        // Evaluar combinaciones
        // Evaluar combinaciones
        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}