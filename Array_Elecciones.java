/*
Se requiere una aplicación en java para almacenar los resultados de las ultimas
elecciones del rector de la Uniremigton Sede Yopal.
Los datos deben almacenarse en una matriz donde
cada fila corresponde a una sede y cada columna corresponde a
un candidato. Se presentaron 5 candidatos para la eleccion.
El programa debe mostrar la tabla con los nombres de las sedes de Colombia;
y los nombres de los candidatos y cada uno de los resultados.
La aplicación también debe mostrar el candidato ganador.
*/
/* codigo ingresado*/

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author PORTATIL
 */
public class Votaciones {

    
    public static void main(String[] args) {
        

     
        String candidatos[], sedes[];
        int votos[][];

        
        int fil, col;

        JTextArea area = new JTextArea(15, 30); 
        JScrollPane scroll = new JScrollPane(area); 
        
        fil = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de las sedes"));
        sedes = new String[fil]; 

        for (int x = 0; x < fil; x++) { 
            sedes[x] = JOptionPane.showInputDialog("nombre para la sede N:" + (x + 1));
        }
	    
