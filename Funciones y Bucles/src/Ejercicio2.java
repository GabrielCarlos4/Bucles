public class Ejercicio2 {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int [] stock = {3, 5, 2, 3, 6};
        generarReporteBajoStock(productos, stock);
    }
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Producto de bajo Stock");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i]<5){
                System.out.println(productos[i]+" en stock: "+stocks[i]);
            }
        }
    }
}
