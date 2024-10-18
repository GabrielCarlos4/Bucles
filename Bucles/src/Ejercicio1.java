import javax.swing.*;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class Ejercicio1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "INGRESE LAS HORAS DEDICADAS A ESTAS ACTIVIDADES\nEstudiar, Hacer ejercicios, Leer, y Tiempo libre.");
        String[] Actividades = {"estudiar", "hacer ejercicio", "leer", "descansar"};

        int[] horas= new int [4];
        int totalHoras=0;

        for (int i = 0; i < 4; i++) {
            String input = JOptionPane.showInputDialog(null,"¿Cuantas horas utilizas para "+ Actividades[i]+"?");
            horas[i]=Integer.parseInt(input);
            totalHoras+=horas[i];
            JOptionPane.showMessageDialog(null, Actividades[i]+": "+ horas[i] + " horas\n");
        }

        JOptionPane.showMessageDialog(null, "Total de horas utilizadas: "+totalHoras);
        }
    }
