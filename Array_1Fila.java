/*
Arreglos bidimensionales
mostrar en el área de texto solo los elementos de la primera fila
 */
package javaapplication1;

import javax.swing.*;

/**
 *
 * @author UNISANGIL
 */
public class JavaApplication1 {

    static String salida="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int [] [] twoD = new int [4] [4];
twoD [0] [0] = 1;  
twoD [0] [1] = 2; 
twoD [0] [2] = 3;
twoD [0] [3] = 4;
twoD [1] [0] = 5;  
twoD [1] [1] = 6; 
twoD [1] [2] = 7;
twoD [1] [3] = 8;
System.out.print (twoD [0] [0] + "");
for(int i=0; i<=3; i++){
salida = salida+twoD[0][i]+ "\n";
}
JTextArea areaSalida = new JTextArea();
areaSalida.append(salida);
//areaSalida.setText( salida ); 
JOptionPane.showMessageDialog( null, areaSalida, "Suma de Matrices", JOptionPane.INFORMATION_MESSAGE ); 
    }
}
