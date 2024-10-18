import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empledados");
        int cantidadEmpleados = scanner.nextInt();
        final int tarifaFija = 15;
        int i=0;
        while (i<cantidadEmpleados) {
            System.out.println("Ingreses las horas trabajadas por el empleado " + (i+1)+ ": ");
            int horas = scanner.nextInt();
            int salario = horas * tarifaFija;
            System.out.println("El salario del emplado "+(i+1)+" es:$"+salario);
            i++;
        }
    }
}
