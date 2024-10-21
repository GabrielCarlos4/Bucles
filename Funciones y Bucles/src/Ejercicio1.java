public class Ejercicio1 {
    public static void main(String[] args) {
        Double[] ventas = {
                120.50, 150.75, 95.20, 200.00, 180.30,
                110.45, 130.60, 140.80, 160.90, 170.20,
                190.10, 210.30, 220.40, 230.50, 240.60,
                250.70, 260.80, 270.90, 280.10, 290.20,
                300.30, 310.40, 320.50, 330.60, 340.70,
                350.80, 360.90, 370.10, 380.20, 390.30
        };
        double ingresos = calcularIngresosMensules(ventas);
        System.out.println("Los ingresos de este mes son de: $"+ ingresos  );
    }
    public static double calcularIngresosMensules(Double[] ventas){
        double total=0;
        for (double venta : ventas) {
            total+=venta;
        }
        return total;
    }
}
