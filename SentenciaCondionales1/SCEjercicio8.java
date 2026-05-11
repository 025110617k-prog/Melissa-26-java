package SentenciaCondionales1;
public class SCEjercicio8 {
    public static void main(String[] args) {
        /*
         * Calcula el precio final según base imponible, tipo de impuesto
         * y código promocional
         */

        System.out.print("Introduzca la base imponible: ");
        String line1 = System.console().readLine();
        double base = Double.parseDouble(line1);
        
        System.out.print("Introduzca el tipo de impuesto (general, reducido o superreducido): ");
        String tipoImpuesto = System.console().readLine();
        
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = System.console().readLine();

        double impuesto = 0;
        if (tipoImpuesto.equalsIgnoreCase("general")) {
            impuesto = 0.21;
        } else if (tipoImpuesto.equalsIgnoreCase("reducido")) {
            impuesto = 0.10;
        } else if (tipoImpuesto.equalsIgnoreCase("superreducido")) {
            impuesto = 0.04;
        }

        double precioConImpuesto = base * (1 + impuesto);
        double descuento = 0;

        if (codigoPromo.equalsIgnoreCase("nopro")) {
            descuento = 0;
        } else if (codigoPromo.equalsIgnoreCase("mitad")) {
            descuento = precioConImpuesto / 2;
        } else if (codigoPromo.equalsIgnoreCase("meno5")) {
            descuento = 5;
        } else if (codigoPromo.equalsIgnoreCase("5porc")) {
            descuento = precioConImpuesto * 0.05;
        }

        double precioFinal = precioConImpuesto - descuento;

        System.out.println("Base imponible          " + String.format("%.2f", base));
        System.out.println("Impuesto (" + (int)(impuesto*100) + "%)     " + String.format("%.2f", base * impuesto));
        System.out.println("Precio con impuesto     " + String.format("%.2f", precioConImpuesto));
        System.out.println("Código promo. (" + codigoPromo + "):  -" + String.format("%.2f", descuento));
        System.out.println("TOTAL                   " + String.format("%.2f", precioFinal));
    }
}