public class Ejercicio6 {
    public static void main(String[] args) {
        double[] facturas = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularImpuesto(facturas);
    }
    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con impuesto del 21%:");
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * 0.21;
            double facturaConImpuesto = facturas[i] + impuesto;
            System.out.println("Factura " + (i + 1) + ": $" + facturas[i] + " + $" + impuesto + " impuesto = $" + facturaConImpuesto);
        }
    }
}
