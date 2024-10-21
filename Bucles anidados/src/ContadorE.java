public class ContadorE {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            String I = (i == 3) ? "E" : String.valueOf(i);
                            String J = (j == 3) ? "E" : String.valueOf(j);
                            String K = (k == 3) ? "E" : String.valueOf(k);
                            String L = (l == 3) ? "E" : String.valueOf(l);
                            String M = (m == 3) ? "E" : String.valueOf(m);

                            System.out.println(I+J+K+L+M);
                        }
                    }
                }
            }
        }
    }
}
