package arreglos_metodo_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodo_Burbuja_Tipo_String {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre[];
        int elementos;

        //pedimos el numero de elementos
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos para tu arreglo: "));
        nombre = new String[elementos];
        for (int i = 0; i < nombre.length; i++) {
            System.out.print((i + 1) + " Digita un nombre: ");
            nombre[i] = leer.next();
            //guardamos el arreglo
        }
        //mostramos el arreglo desordenado tal cual se ah ingresado
        System.out.println("");
        System.out.println("\n El arreglo desordenado: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(nombre[i] + "-");
        }

        //ordenamiento metodo burbuja
        //variable axuliar
        String auxilliar;
        for (int j = 0; j < (elementos - 1); j++) {
            for (int k = 0; k < (elementos - 1); k++) {
                //si el numero en la posicion 1  es mayor a la posicion siguiente 
                if (nombre[k].compareTo(nombre[k + 1]) > 0) {
                    auxilliar = nombre[k];
                    nombre[k] = nombre[k + 1];
                    nombre[k + 1] = auxilliar;
                }
            }
        }
        System.out.println("El arreglo ordenado: ");
        //mostramos el arreglo ordenado
        for (int i = 0; i < elementos; i++) {
            System.out.print(nombre[i] + "-");
        }
    }

}
