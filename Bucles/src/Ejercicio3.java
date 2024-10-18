import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero del producto");
        int producto = scanner.nextInt();
        int i=0;
        while (i<producto) {
            System.out.println("Ingrese la cantidad del producto "+(i+1)+": ");
            int cantidadProductos=scanner.nextInt();
            if (cantidadProductos<5){
                System.out.println("Es necesario realizar un pedido");
            }
            i++;
        }

    }
}
