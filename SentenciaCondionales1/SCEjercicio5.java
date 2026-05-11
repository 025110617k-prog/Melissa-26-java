package SentenciaCondionales1;

public class SCEjercicio5 {
    public static void main(String[] args) {
        int puntos = 0;

        // Pregunta 1
        System.out.println("1. ¿Qué estructura permite ejecutar código condicionalmente?");
        System.out.println("a) for  b) if  c) while");
        System.out.print("Respuesta: ");
        String line1 = System.console().readLine();
        if (line1.equalsIgnoreCase("b")) puntos++;

        // Pregunta 2
        System.out.println("2. ¿Qué tipo de dato almacena números decimales?");
        System.out.println("a) int  b) double  c) char");
        System.out.print("Respuesta: ");
        String line2 = System.console().readLine();
        if (line2.equalsIgnoreCase("b")) puntos++;

        // Pregunta 3
        System.out.println("3. ¿Cuál es el operador de asignación?");
        System.out.println("a) ==  b) =  c) !=");
        System.out.print("Respuesta: ");
        String line3 = System.console().readLine();
        if (line3.equalsIgnoreCase("b")) puntos++;

        // Pregunta 4
        System.out.println("4. ¿Qué bucle se ejecuta mientras una condición sea verdadera?");
        System.out.println("a) for  b) do-while  c) while");
        System.out.print("Respuesta: ");
        String line4 = System.console().readLine();
        if (line4.equalsIgnoreCase("c")) puntos++;

        // Pregunta 5
        System.out.println("5. ¿Qué método convierte String a double?");
        System.out.println("a) parseInt  b) parseDouble  c) toString");
        System.out.print("Respuesta: ");
        String line5 = System.console().readLine();
        if (line5.equalsIgnoreCase("b")) puntos++;

        // Pregunta 6
        System.out.println("6. ¿Cuál es el rango de char?");
        System.out.println("a) 0-255  b) -128 a 127  c) 0-65535");
        System.out.print("Respuesta: ");
        String line6 = System.console().readLine();
        if (line6.equalsIgnoreCase("c")) puntos++;

        // Pregunta 7
        System.out.println("7. ¿Qué palabra clave define un método?");
        System.out.println("a) class  b) public  c) static");
        System.out.print("Respuesta: ");
        String line7 = System.console().readLine();
        if (line7.equalsIgnoreCase("c")) puntos++;

        // Pregunta 8
        System.out.println("8. ¿Qué operador compara igualdad?");
        System.out.println("a) =  b) ==  c) ====");
        System.out.print("Respuesta: ");
        String line8 = System.console().readLine();
        if (line8.equalsIgnoreCase("b")) puntos++;

        // Pregunta 9
        System.out.println("9. ¿Qué estructura almacena múltiples valores?");
        System.out.println("a) int  b) String  c) array");
        System.out.print("Respuesta: ");
        String line9 = System.console().readLine();
        if (line9.equalsIgnoreCase("c")) puntos++;

        // Pregunta 10
        System.out.println("10. ¿Qué método imprime sin salto de línea?");
        System.out.println("a) println  b) print  c) printf");
        System.out.print("Respuesta: ");
        String line10 = System.console().readLine();
        if (line10.equalsIgnoreCase("b")) puntos++;

        // Resultado final
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Puntos obtenidos: " + puntos + "/10");
        
        if (puntos >= 9) {
            System.out.println("¡EXCELENTE! Eres un experto");
        } else if (puntos >= 7) {
            System.out.println("¡MUY BIEN! Buen nivel");
        } else if (puntos >= 5) {
            System.out.println("APROBADO. Puedes mejorar");
        } else {
            System.out.println("INSUFICIENTE. Estudia más");
        }
    }
}