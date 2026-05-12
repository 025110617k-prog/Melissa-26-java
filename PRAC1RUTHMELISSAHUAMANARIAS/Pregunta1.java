package PRAC1RUTHMELISSAHUAMANARIAS;
public class Pregunta1 {
    public static void main(String[] args) {

        String line;
        char letra;

        System.out.print("Ingrese una letra: ");
        line = System.console().readLine();
        letra = line.charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

            System.out.println("Es vocal");

        } else {

            System.out.println("No es vocal");
        }
    }
}