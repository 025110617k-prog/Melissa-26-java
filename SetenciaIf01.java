public class SetenciaIf01 {
    public static void main(String[] args) {
        System.out.println("¿CUAL ES LA CAPITAL DEL PERU?");
        String respuesta = System.console().readLine();

        if(respuesta.equals("lima" )){
          System.out.println(" ¡la respuesta es correcta!");  

        }else{
        System.out.println("¡la respuesta es incorrecta!");
    }

    }
}
