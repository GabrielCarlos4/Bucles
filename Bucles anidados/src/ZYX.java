public class ZYX {
    public static void main(String[] args) {
        String Alfabeto = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        for (int i = 0; i < Alfabeto.length(); i++) {
            String subcadena = Alfabeto.substring(i);
            System.out.println(subcadena);
        }
    }
}
