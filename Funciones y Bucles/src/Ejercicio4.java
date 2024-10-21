public class Ejercicio4 {
    public static void main(String[] args) {
        String[] clientes={"Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4", "Cliente 5"};
        int[] compras={5, 7, 10, 12, 2};
        calcularDescuentos (clientes, compras);
    }
    public static void calcularDescuentos (String[] clientes, int[] compras){
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i]>10) {
                double descuento = compras[i] * 0.10;
                System.out.println("El "+clientes[i]+" tiene un descuento de $"+descuento);
            } else {
                System.out.println("El "+clientes[i]+" no recibira descuento");
            }
        }
    }
}
