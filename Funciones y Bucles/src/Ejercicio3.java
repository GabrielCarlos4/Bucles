public class Ejercicio3 {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "Ana", "Pedro", "Maria", "Luis"};
        double[] facturasPendientes = {300.0, 600.0, 450.0, 700.0, 200.0};

        enviarFacturas(clientes, facturasPendientes);
    }
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500.0) {
                System.out.println(clientes[i]);
            }
        }
    }
}
