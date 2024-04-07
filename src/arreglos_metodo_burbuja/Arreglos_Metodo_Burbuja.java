
package arreglos_metodo_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;
/*METODO BURBUJA*/
public class Arreglos_Metodo_Burbuja {
    public static void main(String[] args) {
        /*
        si numero actual es mayor a numero siguiente 
        cambio
        */
        Scanner  leer = new Scanner(System.in);
        /*DEFINIMOS NUESTRAS VARIABLES*/
        int arreglo[],elementos,aux;
        elementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LOS NUMEROS DE ELEMENTOS PARA SU ARREGLO: "));
        //asiganamos el numero de elementos al arreglo
        arreglo = new int[elementos];
        //pedimos el numero de elementos
        for (int i = 0; i < elementos; i++) {
            System.out.print((i+1)+"DIGITA UN NUMERO: ");
            arreglo[i] = leer.nextInt();
        }
        //utilizamos el metodo burbuja
        //este for sirve para que se dee cuanta cuantas vueltas tiene que dar
        for (int i = 0; i < (elementos-1); i++) {
            //este for nos sirve para ordenra en si el arreglo para intercambiar
            for (int j = 0; j < (elementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {//si numero actual es mayor al numero siguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        //mostramos el arreglo en forma creciente
        System.out.println("ARREGLO ORDENADO EN FORMA CRECIENTE");
        System.out.println();
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i]+"-");
        }
        System.out.print("\n ARREGLO DE FORMA EN FORMA DECRECIENTE");
        System.out.println();
        for (int i = elementos-1; i >= 0; i--) {
                System.out.print(arreglo[i]+"-");
        }
    }
}