package EjerciciosArray;

public class Array2 {
    public static void main(String[] args) {
        int[] num = new int[5]; //declara el array num y dandole la longitud
        num[0] = 8;
        num[1] = 23;
        num[2] = 300;
        num[3] = 150;
        num[4] = 11;
        System.out.println("El array num tiene 5 elementos");
        System.out.print("Introduzca un número del 0 al 4,para ver el valor: ");

        int indice = Integer.parseInt(System.console().readLine());

        System.out.print("El elemento que se encuentra en la posición " + indice);
        System.out.println(" es el " + num[indice]);
    }
}  