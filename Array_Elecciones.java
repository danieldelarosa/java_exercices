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

        
        col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese e numero de candidatos"));
        candidatos = new String[col];
        for (int x = 0; x < col; x++) { 
            candidatos[x] = JOptionPane.showInputDialog("nombre del candidato n:" + (x + 1));
        }

        votos = new int[fil][col]; 

        for (int x = 0; x < fil; x++) {
            for (int y = 0; y < col; y++) { 
                votos[x][y] = Integer.parseInt(JOptionPane.showInputDialog("ingrese los votos de la sede " + sedes[x] + " paea el candidato " + candidatos[y]));

            }
        }
       
        int[] totalVotos = new int[candidatos.length];
        for (int y = 0; y < col; y++) {
            for (int x = 0; x < fil; x++) {
                totalVotos[y] += votos[x][y];
            }
        }

        
        int max = 0;
        int pos = 0;
        for (int i = 0; i < totalVotos.length; i++) {
            if (max < totalVotos[i]) {
                max = totalVotos[i];
                pos = i;
            }
        }
        

        area.append("candidato con mayoria de votos:" + candidatos[pos] + "Total de votos" + totalVotos[pos]);
        
        for (int i = 0; i < fil; i++) {
            area.append("\n" + sedes[i]);
            for (int x = 0; x < col; x++) {
                area.append("\n" + candidatos[x]);
                area.append("\t" + votos[i][x]);
            }
        }

        
        JOptionPane.showMessageDialog(null, scroll);

    }//fin del main

}//fin de la clase principal
