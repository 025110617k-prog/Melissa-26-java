package Ejercicios13Bucles;
public class EjercicioBucles1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 5) {
             if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}