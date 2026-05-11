package SentenciaCondionales1;

public class SCEjercicio4 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que nos diga el horóscopo a partir
         * del día y el mes de nacimiento.
         */

        System.out.print("Día de nacimiento: ");
        String lineDia = System.console().readLine();
        int dia = Integer.parseInt(lineDia);
        
        System.out.print("Mes de nacimiento: ");
        String lineMes = System.console().readLine();
        int mes = Integer.parseInt(lineMes);
        
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            horoscopo = "ACUARIO";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            horoscopo = "PISCIS";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            horoscopo = "ARIES";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            horoscopo = "TAURO";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            horoscopo = "GÉMINIS";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            horoscopo = "CÁNCER";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            horoscopo = "LEO";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            horoscopo = "VIRGO";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            horoscopo = "LIBRA";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            horoscopo = "ESCORPIO";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 20)) {
            horoscopo = "SAGITARIO";
        } else if ((mes == 12 && dia >= 21) || (mes == 1 && dia <= 19)) {
            horoscopo = "CAPRICORNIO";
        } else {
            horoscopo = "FECHA INVÁLIDA";
        }

        System.out.println("Tu signo es " + horoscopo);
    }
}