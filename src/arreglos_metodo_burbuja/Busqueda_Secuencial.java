/*
 Busqueda secuencial
 arreglo[i] = {3,2,5,6,7,9};
 dato = 2;
 */
package arreglos_metodo_burbuja;

import javax.swing.JOptionPane;

public class Busqueda_Secuencial {

    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        boolean ban = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL NUMERO A BUSCAR: "));
        //buscar el numero 
        int i = 0;
        while (i < 5 && ban == false) {
            if (arreglo[i] == dato) {
                ban = true;
            }
            i++;
        }
        if (ban == false) {
            JOptionPane.showMessageDialog(null, "EL NUMERO NO SE ENCUENTRA EN EL ARREGLO");
        } else {
            JOptionPane.showMessageDialog(null, "EL NUMERO SI ESTA DENTRO DEL ARREGLO EN LA POSICION: " + (i - 1));
        }
    }
}
