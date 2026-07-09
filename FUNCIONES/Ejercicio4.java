public class Ejercicio4 {
    public class ArrayUnidimensional {

    // 1. generaArrayInt [cite: 29]
    public static int[] generaArrayInt(int n, int minimo, int maximo) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            // Genera números aleatorios dentro del rango [minimo, maximo]
            a[i] = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
        }
        return a;
    }

    // 2. minimoArrayInt [cite: 30]
    public static int minimoArrayInt(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    // 3. maximoArrayInt [cite: 31]
    public static int maximoArrayInt(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // 4. mediaArrayInt [cite: 32]
    public static double mediaArrayInt(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return (double) suma / a.length;
    }

    // 5. estaEnArrayInt [cite: 33]
    public static boolean estaEnArrayInt(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) return true;
        }
        return false;
    }

    // 6. posicionEnArray [cite: 34]
    public static int posicionEnArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) return i; // Devuelve el primer índice donde se encuentra
        }
        return -1;
    }

    // 7. volteaArrayInt [cite: 35]
    public static int[] volteaArrayInt(int[] a) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[a.length - 1 - i];
        }
        return resultado;
    }

    // 8. rotaDerechaArrayInt [cite: 36]
    public static int[] rotaDerechaArrayInt(int[] a, int n) {
        int longitud = a.length;
        int[] resultado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            resultado[(i + n) % longitud] = a[i];
        }
        return resultado;
    }

    // 9. rotaIzquierdaArrayInt [cite: 37]
    public static int[] rotaIzquierdaArrayInt(int[] a, int n) {
        int longitud = a.length;
        int[] resultado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            // Restar y sumar la longitud evita que arroje posiciones negativas
            resultado[(i - n % longitud + longitud) % longitud] = a[i];
        }
        return resultado;
    }
}
    
}
