package SentenciaCondionales1;
public class SCEjercicio9 {
    public static void main(String[] args) {
        /*
         * Genera la nómina desglosada de un empleado según:
         * Cargo (1-Junior:950€, 2-Senior:1200€, 3-Jefe:1600€)
         * Días de viaje (30€/día)
         * IRPF (Soltero:25%, Casado:20%)
         */

        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        String lineCargo = System.console().readLine();
        int cargo = Integer.parseInt(lineCargo);
        
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        String lineDias = System.console().readLine();
        double dias = Double.parseDouble(lineDias);
        
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        String lineCivil = System.console().readLine();
        int estadoCivil = Integer.parseInt(lineCivil);

        double sueldoBase = 0;
        if (cargo == 1) {
            sueldoBase = 950;
        } else if (cargo == 2) {
            sueldoBase = 1200;
        } else if (cargo == 3) {
            sueldoBase = 1600;
        }

        double dietas = dias * 30;
        double sueldoBruto = sueldoBase + dietas;
        
        double irpf = 0;
        if (estadoCivil == 1) {
            irpf = 0.25;
        } else if (estadoCivil == 2) {
            irpf = 0.20;
        }
        
        double retencion = sueldoBruto * irpf;
        double sueldoNeto = sueldoBruto - retencion;

        System.out.println("\n---------------------------------");
        System.out.println("| Sueldo base                   " + String.format("%.2f", sueldoBase) + " |");
        System.out.println("| Dietas (" + (int)dias + " viajes)         " + String.format("%.2f", dietas) + " |");
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo bruto                  " + String.format("%.2f", sueldoBruto) + " |");
        System.out.println("| Retención IRPF (" + (int)(irpf*100) + "%)  " + String.format("%.2f", retencion) + " |");
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo neto                  " + String.format("%.2f", sueldoNeto) + " |");
        System.out.println("----------------------------------");
    }
}