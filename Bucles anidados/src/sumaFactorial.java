import java.util.Scanner;

public class sumaFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total=0;

        System.out.println("Ingrese un numero");
        int N = scanner.nextInt();
        for (int j = 0; j <= N; j++) {
            int factorial = 1;

            for (int i = 1; i <= j; i++) {
                factorial=factorial*i;
            }
            System.out.println(j+"! = "+factorial);
            total+=factorial;
        }
        System.out.println("La suma de los factoriales es: "+total );

    }
}
