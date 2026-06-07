package Ejercicios5Array;
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random() * 101); 
            cuadrado[i] = numero[i] * numero[i];    
            cubo[i] = numero[i] * numero[i] * numero[i]; 
        } 
        
        System.out.println("Número\tCuadrado\tCubo");
        System.out.println("---------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}