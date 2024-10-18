import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i=0;
        System.out.println("Ingrese el numero de empleados");
        int empleados=scanner.nextInt();

        do {
            System.out.println("Ingrese las horas trabajadas por el empledo "+(i+1)+": ");
            int horas= scanner.nextInt();
            if (horas>40) {
                int horasExtra = horas - 40;
                System.out.println("El empleado "+(i+1)+" trabajó "+horasExtra+" horas extras");
            }
            i++;
        } while (i<empleados);
    }
}
