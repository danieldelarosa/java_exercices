/*
Se requiere una aplicación en java para almacenar los resultados de las ultimas
elecciones del rector de la Uniremigton Sede Yopal.
Los datos deben almacenarse en una matriz donde
cada fila corresponde a una sede y cada columna corresponde a
un candidato. Se presentaron 5 candidatos para la eleccion.
El programa debe mostrar la tabla con los nombres de las sedes;
y los nombres de los candidatos y cada uno de los resultados.
La aplicación también debe mostrar el candidato ganador.
*/

correcion agregada

import javax.swing.*;
import java.util.Scanner; 

public class ArrayElecciones {
	
	
  public static void main(String args[]) {      
 Scanner teclado = new Scanner(System.in);//---creando objeto para pedir datos por teclado
// variables inicializadas         
      // Arreglos
		// matriz inicializado con 5 candidatos
        String  Candidatos [] =  { " Juan" , " Pedro" ,"jesus","manuel","pepito" };
		
        // matriz inicializado con 6 sedes
        String  SedeFila [] = { " Aguazul ", "trinidad","paz deariporo","pore","tauramena" };
		
		// matriz que almacena los votos
           int f,c;
           int[][] Votos; 
           int []vecres;
           int numerom=0;
           String casilla = null;
           
	   Votos = new int [5][6];
           vecres= new int [5];
  
    }    
  
  
}
