public class NumeroPerfecto {
    public static void main(String[] args) {
        int resultado;
        System.out.println("Numeros perfecto entre el 1 y el 1000");
        for (int i = 1; i <=1000 ; i++) {
            resultado=0;
            for (int j=1; j<i ; j++) {
                if (i%j==0){
                    resultado=resultado+j;
                }
            }
            if (i==resultado){
                System.out.println(i);
            }
        }
    }
}
