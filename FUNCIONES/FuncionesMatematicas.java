public class FuncionesMatematicas {

    // 1. esCapicua [cite: 7]
    public static boolean esCapicua(long x) {
        return x == voltea(x); // Un número es capicúa si es igual a su reverso [cite: 6]
    }

    // 2. esPrimo [cite: 8]
    public static boolean esPrimo(long x) {
        if (x < 2) return false;
        for (long i = 2; i <= x / 2; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // 3. siguientePrimo [cite: 9]
    public static long siguientePrimo(long x) {
        long n = x + 1;
        while (!esPrimo(n)) { // Reutiliza esPrimo [cite: 6]
            n++;
        }
        return n;
    }

    // 4. potencia [cite: 10]
    public static double potencia(double base, int exponente) {
        if (exponente == 0) return 1;
        double resultado = 1;
        int expAbs = exponente < 0 ? -exponente : exponente;
        
        for (int i = 0; i < expAbs; i++) {
            resultado *= base;
        }
        return exponente < 0 ? 1.0 / resultado : resultado;
    }

    // 5. digitos [cite: 11]
    public static int digitos(long x) {
        if (x == 0) return 1;
        if (x < 0) x = -x;
        int contador = 0;
        while (x > 0) {
            contador++;
            x /= 10;
        }
        return contador;
    }

    // 6. voltea [cite: 12]
    public static long voltea(long x) {
        if (x < 0) return -voltea(-x);
        long volteado = 0;
        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x /= 10;
        }
        return volteado;
    }

    // 7. digitoN [cite: 13]
    public static int digitoN(long x, int n) {
        x = voltea(x); // Volteamos para contar de izquierda a derecha de forma simple [cite: 14]
        for (int i = 0; i < n; i++) {
            x /= 10;
        }
        return (int) (x % 10);
    }

    // 8. posicionDeDigito [cite: 15]
    public static int posicionDeDigito(long x, int d) {
        x = voltea(x);
        int posicion = 0;
        while (x > 0) {
            if (x % 10 == d) {
                return posicion;
            }
            posicion++;
            x /= 10;
        }
        return -1; // No encontrado [cite: 16]
    }

    // 9. quitaPorDetras [cite: 17]
    public static long quitaPorDetras(long x, int n) {
        for (int i = 0; i < n; i++) {
            x /= 10;
        }
        return x;
    }

    // 10. quitaPorDelante [cite: 18]
    public static long quitaPorDelante(long x, int n) {
        x = voltea(x);
        x = quitaPorDetras(x, n);
        return voltea(x);
    }

    // 11. pegaPorDetras [cite: 19]
    public static long pegaPorDetras(long x, int d) {
        return (x * 10) + d;
    }

    // 12. pegaPorDelante [cite: 20]
    public static long pegaPorDelante(long x, int d) {
        return juntaNumeros(d, x); // Reutiliza juntaNumeros
    }

    // 13. trozoDeNumero [cite: 21]
    public static long trozoDeNumero(long x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDetras(x, longitud - fin - 1);
        x = quitaPorDelante(x, inicio);
        return x;
    }

    // 14. juntaNumeros [cite: 22]
    public static long juntaNumeros(long x, long y) {
        int digitosY = digitos(y);
        for (int i = 0; i < digitosY; i++) {
            x *= 10;
        }
        return x + y;
    }
}