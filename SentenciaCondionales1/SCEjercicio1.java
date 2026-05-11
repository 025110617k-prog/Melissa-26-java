package SentenciaCondionales1;
public class SCEjercicio1 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que calcule el salario semanal
         * de un trabajador teniendo en cuenta que las horas ordinarias
         * (40 primeras horas de trabajo) se pagan a 12 soles la hora.
         * A partir de la hora 41, se pagan a 16 soles la hora.
         */
        System.out.print("Ingresa las horas trabajadas: ");
        String line = System.console().readLine();
        double horasTrabajadas = Double.parseDouble(line);
        double salario = 0;


        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 12;
            System.out.println("El pago semanal es: "+salario);
        } else {
           
            double horasExtras = horasTrabajadas - 40;
            salario = (horasTrabajadas * 12) + (horasExtras * 4) ;
            System.out.println("El pago semanal es: "+salario);
        }
    }
}
