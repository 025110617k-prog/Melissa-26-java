package SentenciaCondionales1;
public class SCEjercicio3 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que calcule la media de tres notas y que indique
         * si la nota del boletín:
         * insuficiente (01-10), suficiente (11-12), bien (13-15),
         * notable o sobresaliente (16-20)
         */

        System.out.print("Introduzca primera nota: ");
        String line1 = System.console().readLine();
        double nota1 = Double.parseDouble(line1);
        
        System.out.print("Introduzca segunda nota: ");
        String line2 = System.console().readLine();
        double nota2 = Double.parseDouble(line2);
        
        System.out.print("Introduzca tercera nota: ");
        String line3 = System.console().readLine();
        double nota3 = Double.parseDouble(line3);
        
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.print("La media es " + media + ". Nota del boletín: ");
        
        if (media <= 10) {
            System.out.println("INSUFICIENTE");
        } else if (media <= 12) {
            System.out.println("SUFICIENTE");
        } else if (media <= 15) {
            System.out.println("BIEN");
        } else {
            System.out.println("NOTABLE O SOBRESALIENTE");
        }
    }
}
    