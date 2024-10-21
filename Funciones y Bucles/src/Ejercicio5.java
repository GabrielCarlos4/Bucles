public class Ejercicio5 {
    public static void main(String[] args) {
        Double [] calificaciones={1.0, 2.0, 3.0, 4.0, 5.0};
        double satisfaccion= calcularPromedioSatisfaccion(calificaciones);
        System.out.println("Promedio de satisfacción del cliente: "+satisfaccion);
    }
    public static double calcularPromedioSatisfaccion (Double[] calificaciones){
        Double total=0.0;
        for (int i = 0; i < calificaciones.length; i++) {
            total+=calificaciones[i];
        }
        Double promedio=total/calificaciones.length;
        return promedio;
    }
}

