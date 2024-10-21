import java.util.Scanner;

public class Nprimos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int N = scanner.nextInt();
        System.out.println("Numeros primos desde 1 hasta "+N);
        for (int i = 2; i < N; i++) {
            int j = 2;
            while (i%j!=0){
                j++;
            }
            if (i==j) {
                System.out.println(i);
            }
        }
    }
}
