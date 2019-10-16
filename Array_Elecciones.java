/*
Se requiere una aplicación en java para almacenar los
resultados de las ultimas elecciones de rector de la universidad
del Valle. Los datos deben almacenarse en una matriz donde
cada fila corresponde a una sede y cada columna corresponde a
un candidato. El programa debe mostrar la tabla con los
nombres de las sedes y los nombres de los candidatos y cada
uno de los resultados. La aplicación también debe mostrar el
candidato ganador
 */
package javaapplication2;
import javax.swing.*;

/**
 *
 * @author UNISANGIL
 */
public class JavaApplication2 {
    public static void main(String a[]) {
        String candidatos[], sedes[];
        int votos[][], fil, col;
        JTextArea area=new JTextArea(15,30);
        JScrollPane scroll = new JScrollPane(area);
        fil= Integer.parseInt (JOptionPane.showInputDialog ("Ingrese el numero de sedes"));
        sedes = new String [fil];
        
        for (int x=0; x<fil; x++){
            sedes[x] = JOptionPane.showInputDialog("Sede No:" +(x+1));
        }
        
        col= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de candidatos"));
        candidatos = new String[col];
        
        for (int x=0; x<fil; x++){
        candidatos[x]=JOptionPane.showInputDialog("Nombre del candidato No:"+(x+1));
        }
            votos = new int[fil][col];
        for (int x=0; x<fil;x++){
        for (int y=0; y<col; y++){
                votos[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos de la sede" +sedes[x]+ "para el candidato" +candidatos[y]));
            }
        }
    
        int[] totalVotos = new int[candidatos.length];
        
        for (int y=0; y<col; y++){
            for (int x=0;x<fil;x++){
                totalVotos[y] +=votos[x][y];
            }
        }
        int max =0;
        int pos=0;
        for (int i=0; i<totalVotos.length; i++){
        if (max<totalVotos[i]){
            max=totalVotos[i];
            pos=i;
        }
    }
        area.append("Candidato con mayoria de votos:"+candidatos[pos]+"Total de votos:"+totalVotos[pos]);
        for (int i=0; i<fil; i++){
            area.append("\n"+sedes[i]);
            for (int x=0; x<col; x++){
                area.append("\n"+candidatos[x]);
                area.append("\n"+votos[i][x]);
            }
        }
        JOptionPane.showMessageDialog(null,scroll);
    }    
}