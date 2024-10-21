public class Ejercicio9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 200.0, 300.0, 400.0, 500.0};

        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        System.out.println("Precios finales después de aplicar un descuento del 10%:");
        for (int i = 0; i < preciosFinales.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + preciosOriginales[i] + " -> $" + preciosFinales[i]);
        }
    }
    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];
        for (int i = 0; i < preciosOriginales.length; i++) {
            double descuento = preciosOriginales[i] * 0.10;
            preciosFinales[i] = preciosOriginales[i] - descuento;
        }
        return preciosFinales;
    }
}
