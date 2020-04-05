//Dennys Katerinne Rojas O.

import javax.swing.*;


public class ArrayElecciones {
  public static void main(String a[]) {
      
      
       //variables inicializadas 
        int SedeFila=29;
        int CandiColum=5;
        
      //Arreglos
      //array inicializado con 5 candidatos
        String candidatos[]= {"Carlos","Andres","Luis","Diego","Saul","Rodrigo"};;
        //array inicializado con 6 sedes
        String sedes[] = {"Apartado","Armenia","Bogotá","Bucaramanga","Buga","Cali","Cartago","Caucasia","Cúcuta","Duitama","Ibague"
			 ,"Ipiales","Manizales","Medellin","Monteria","Palmira","Pasto","Pereira","Popayan","Quibdo","Rionegro"
			 ,"Sahagún","Sincelejo","Sogamoso","Tuluá","Tumaco","Tunja","Villavicencio","Yopal"};
        int votos[][];
        
            
       //Ingresa datos en los arreglos 
        
        votos = new int[SedeFila][CandiColum];
        for (int x = 0; x<SedeFila;x++){
            for (int y = 0; y<CandiColum; y++){
               votos[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los votos de la sede " +sedes[x]+ " para el candidato " +candidatos[y]));
            }
        }

        int[] Total = new int[candidatos.length];

        for (int y=0; y<CandiColum; y++){
            for (int x=0;x<SedeFila;x++){
                Total[y] +=votos[x][y];
            }
        }
        
        
        // que candidato tuvo mas votos 
        int max =0;
        int pos=0;
        
            for (int i=0; i<Total.length; i++){
                if (max < Total [i]){
                    max = Total [i];
                    pos=i;
                }
            }
            
        //espacio donde se visualizan los datos sedes, candidatos y votos
            
        JTextArea area=new JTextArea(15,30);
        JScrollPane scroll = new JScrollPane(area);
            
        area.append("Candidato con mayoria de votos: "+candidatos[pos]+" Total de votos: "+Total[pos]);
        for (int i=0; i<SedeFila; i++){
            area.append("\n"+sedes[i]);
                for (int x=0; x<CandiColum; x++){
                    area.append("\n"+candidatos[x]);
                    area.append("\n"+votos[i][x]);
                }
        }
        
        JOptionPane.showMessageDialog(null,scroll);
  
    }    
  
  
}
