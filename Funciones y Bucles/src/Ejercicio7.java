public class Ejercicio7 {
    public static void main(String[] args) {
        double[] compras = {450.0, 600.0, 300.0, 700.0, 550.0};

        aplicarDescuento(compras);
    }
    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento del 15% (si superan $500):");
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500.0) {
                double descuento = compras[i] * 0.15;
                double compraConDescuento = compras[i] - descuento;
                System.out.println("Compra " + (i + 1) + ": $" + compras[i] + " - $" + descuento + " descuento = $" + compraConDescuento);
            } else {
                System.out.println("Compra " + (i + 1) + ": $" + compras[i] + " (sin descuento)");
            }
        }
    }
}
