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
/* codigo ingresado*/

correcion agregada

import javax.swing.*;
import java.util.Scanner;

public class ArrayElecciones {
	
	
  public static void main(String args[]) {      
//ivan mauricio leal alvarez----------------
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
  //------------John Fredy Bonilla-----------------------
	  
	  // ingreso de votos
       for(f=0  ; f< SedeFila.length ; f++)
       {    
           for(c=0 ; c< Candidatos.length;c++)
           {
              System.out.println("Porfavor ingrese la cantidad de votos que saco en el municipio ("+SedeFila[f]+") el candidato ("+Candidatos[c]+") ");
              // Votos[SedeFila][CandiColum]=teclado.nextInt();//
              Votos[f][c]= teclado.nextInt();
           }
       }
       //operacion suma por columnas
         for(f=0 ; f< SedeFila.length ; f++)
           { 
           int sumaC=0;
           for(c=0  ; c< Candidatos.length;c++)
           {
            sumaC=Votos[c][f]+sumaC;  
            vecres[f]=sumaC;
             
           } 
           System.out.println("candidato "+Candidatos[f]+" resultado  es: " + vecres[f]);
             
       } 
       
     //contibucion carlos cogua
            // comparacion de puntuacion mayor     
            for(f=0 ; f< SedeFila.length ; f++)
            { 
                if(vecres[f]>vecres[f])
        { 
                      numerom = vecres[0];
                      casilla = Candidatos[f];
          
        }
          else
          {
          if(vecres[f]>numerom)
              {
          numerom =vecres[f];
                casilla = Candidatos[f];
            }
                
          }
          }
        System.out.println("Con una votacion de  "+ numerom+ " el candidadto ganador para director de sede yopal  es ; " +casilla);

    }   
    
  
}
