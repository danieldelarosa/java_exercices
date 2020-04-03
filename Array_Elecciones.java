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

public class ArrayElecciones {
	
	
  public static void main(String args[]) {      
      
       //variables inicializadas 
	   
        int SedeFila=6;
        int CandiColum=5;
        
      //Arreglos
		//array inicializado con 5 candidatos
        String Candidatos[]=new String[CandiColum];
		
        //array inicializado con 6 sedes
        String Sedes[] = {"Aguazul","Paz de Ariporo","Tauramena","Trinidad","Villanueva","Yopal"};
		
		//array que almacenara los votos 
	   int Votos[][];
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
    }    
  
  
}
