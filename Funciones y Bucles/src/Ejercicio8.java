public class Ejercicio8 {
    public static void main(String[] args) {
        String[] empleados = {"Juan", "Ana", "Pedro", "Maria", "Luis"};
        int[] horasTrabajadas = {40, 35, 45, 30, 50};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        System.out.println("Pago semanal de los empleados (a razón de $15 por hora):");
        for (int i = 0; i < empleados.length; i++) {
            int pagoSemanal = horasTrabajadas[i] * 15;
            System.out.println(empleados[i] + ": $" + pagoSemanal);
        }
    }
}
