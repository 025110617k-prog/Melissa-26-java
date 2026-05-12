package PRAC1RUTHMELISSAHUAMANARIAS;
public class Pregunta2 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("funf");

            } else if (i % 3 == 0) {

                System.out.println("drei");

            } else if (i % 5 == 0) {

                System.out.println("funf");

            } else {

                System.out.println(i);
            }

            i++;
        }
    }
}