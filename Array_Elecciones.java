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


correcion agregada
import javax.swing.*;

public class ArrayElecciones {
	
	
  public static void main(String args[]) {    
    
    
    //ivan mauricio leal alvarez----------------
           
    // Arreglos
    // matriz inicializado con 5 candidatos
        String  Candidatos [] =  { " Juan" , " Pedro" ,"Jesus","Manuel","Ismael" }; 
		
    // matriz inicializado con 29 sedes
        String  SedeFila [] = { " APARTADO ", " ARMENIA "," BOGOTÀ "," BUCARAMANGA "," BUGA "," CALI "," CARTAGO "," CAUCASIA "," CUCUTA ",
                               " DUITAMA "," IBAGUE "," IPIALES "," MANIZALES "," MEDELLIN ", " MONTERIA "," PALMIRA "," PASTO "," PEREIRA ",
                               " POPAYAN "," QUIBDO "," RIONEGRO "," SAHAGUN "," SINCELEJO "," SOGAMOSO "," TULUA "," TUMACO "," TUNJA "," VILLAVICENCO "," YOPAL "};
		
    // matriz que almacena los votos
        int Votos [][]; 
        int veces [];
    
    // variables inicializadas 
        int SedeFil=29;
        int CandiColum=5;
    	
        
    //------------John Fredy Bonilla-----------------------
	  
     // ingreso de votos
      	Votos = new int[SedeFil][CandiColum];
       for(int f=0  ; f< SedeFila.length ; f++){    
           for(int c=0 ; c< Candidatos.length;c++){
                Votos[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la cantidad de votos que saco en la sede "
                                                                           +SedeFila[f]+ " el candidato " +Candidatos[c]));
           }
       }
    		
    //operacion suma por columnas
        veces = new int[Candidatos.length];
        for (int y=0; y<CandiColum; y++){
            for (int x=0;x<SedeFil;x++){
                veces[y] +=Votos[x][y];
            }
        }
    
       
    //contibucion karen
    // comparacion de puntuacion mayor     
        int comparacion =0;
        int cas=0;
        
            for (int i=0; i<veces.length; i++){
                if (comparacion < veces [i]){
                    comparacion = veces [i];
                    cas=i;
                }
            }
    

        JTextArea area = new JTextArea(15, 30); 
        JScrollPane scroll = new JScrollPane(area); 

		// ----- darwin castañeda--------------

				 area.append("El candidato que obtuvo la mayoría de votos es: " + veces[cas] +" -- Total de Votos obtenidos: " + Candidatos[cas]);

							for (int i = 0; i < SedeFila.length; i++){
                    area.append("\n"+SedeFila[i]);
                        for (int x = 0; x < Candidatos.length; x++){
                            area.append("\n"+Candidatos[x]);
                            area.append("\t"+Votos[i][x]); //HAY QUE MODIFICAR LA ESTRUCTURA DE COMO IMPRIME EN PANTALLA
                        }
								}
                    JOptionPane.showMessageDialog(null, scroll);
    	}                  
} 
