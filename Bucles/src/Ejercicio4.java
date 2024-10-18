import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalVentas=0;

        for (int día = 1; día <= 7; día++) {
            System.out.println("Ingrese ventas del día "+día+": ");
            int ventas= scanner.nextInt();
            totalVentas+= ventas;
        }
        System.out.println("El total de ventas de la semana es: "+totalVentas);
    }
}
