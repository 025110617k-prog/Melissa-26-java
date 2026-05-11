public class SentenciaIf03 {
    public static void main(String[] args) {
        int notal,nota2,nota3;
        double promeddio;
         System.out.println(" ingrese la nota1:");
         notal = Integer.parseInt(System.console().readLine());

             System.out.println(" ingrese la nota2:");
         nota2 = Integer.parseInt(System.console().readLine());

             System.out.println(" ingrese la nota3:");
         nota3 = Integer.parseInt(System.console().readLine());

         promeddio = (notal + nota2 + nota3)/3;

         if(promeddio >= 10.5){
             System.out.println("promeddio");
            System.out.println("felicidades has aprobado");
         }else{
            System.out.println("promeddio");
            System.out.println("lo siento,para el otro año sera!!");
         }
    }
    
}
