package arreglos_metodo_burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;
//metodo inserccion

public class Metodo_Insercion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*si numero izquierdo es mayor a numero actual {cambio}*/
        int arreglo[], elementos, posicion, aux;
        elementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL NUMERO DE ELEMENTOS DEL ARREGLO: "));
        arreglo = new int[elementos];
        System.out.print("DIGITE EL ARREGLO: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print((i + 1) + " Digite un numero: ");
            arreglo[i] = leer.nextInt();
        }
        //odenamiento por inserccion
        for (int i = 0; i < elementos; i++) {
            posicion = i;
            aux = arreglo[i];
            while (posicion > 0 && arreglo[posicion - 1] > aux) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
                //para que valla conprobando los numero  la izquierda
            }
            //refresacamos el numero actual
            arreglo[posicion] = aux;
        }
        //imprimimos el arreglo
        System.out.print("\nORDEN ASCENDE: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println("");

        System.out.print("\nORDEN ASCENDTE: ");
        for (int i = (elementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + "-");
        }
    }

}
