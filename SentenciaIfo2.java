public class SentenciaIfo2 {
    public static void main(String[] args) {
        System.out.println( "¿ CUAL ES LA CAPITAL DEL PERU?");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println(" El numero ingresado es POSITIVO");
        } else{
            System.out.println("El numero ingresado es NEGATIVO");
            if (numero < 6) {
            System.out.println(" El numero ingresado es POSITIVO");
        } else{
            System.out.println("El numero ingresado es NEGATIVO");
        }
    }
    
}
}
