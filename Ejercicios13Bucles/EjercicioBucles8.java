package Ejercicios13Bucles;
public class EjercicioBucles8 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long numero = Long.parseLong(System.console().readLine());
        
        int digitos = 0;
        long auxiliar = numero;
        
        while (auxiliar > 0) {
            digitos++;
            auxiliar /= 10;
        }
        
        System.out.println("El número tiene " + digitos + " dígitos");
    }
}