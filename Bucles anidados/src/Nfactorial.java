import java.util.Scanner;

public class Nfactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int N = scanner.nextInt();
        for (int j = 0; j <= N; j++) {
            int factorial = 1;

            for (int i = 1; i <= j; i++) {
                factorial=factorial*i;
            }
            System.out.println(j+"! = "+factorial);
        }


    }
}
