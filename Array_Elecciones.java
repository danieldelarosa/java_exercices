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
    
	
?????--ZARYS VARGAS--??????

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

// Aporte darwin castañeda, posible solucion del ejercicio.

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class votaciones {
	
		public static void main (String a[]){
		String candidatos[], sedes[];
		int votos[][], fila, colum;

		JTextArea area= new JTextArea(15, 30);;
		JScrollPane scroll = new JScrollPane(area);
		 fila = Integer.parseInt(JOptionPane.showInputDialog
		 ("Por favor ingrese el número de sedes:"));
		 
		 
		sedes = new String[fila];
		for (int x = 0; x < fila; x++){
		sedes[x] = JOptionPane.showInputDialog("Por favor ingres el nombre de la Sede No :"+(x+1));
		 
		}

		colum = Integer.parseInt(JOptionPane.showInputDialog ("Por favor ingrese el número de candidatos:"));
		candidatos = new String[colum];
		for (int x = 0; x < colum; x++){
		candidatos[x] = JOptionPane.showInputDialog("por favor ingrese el nombre del Candidato No :"+(x+1) );
		
		}
		
		votos = new int[fila][colum];
		for (int x = 0; x < fila; x++){
		 for (int y = 0; y < colum; y++){
		votos[x][y] = Integer.parseInt(JOptionPane.
		 showInputDialog("**Ingrese los votos de la sede** " +  sedes [x] + " para el candidato " + candidatos [y] ));
		 } 
		 
		}

		
		int[] totalv = new int[candidatos.length];
		for (int y = 0; y < colum; y++){
		for (int i = 0; i < fila; i++){
		totalv[y] += votos[i][y];
		 }
		
		}

		int max = 0;
		int pos = 0;
		for (int i = 0; i < totalv.length; i++){
		if ( max < totalv[i] ){
		max = totalv[i];
		pos = i;
		 }
		}

		 area.append("Candidato que obtubo la mayoría de votos es: " + candidatos [pos] +" °°Total de Votos obtenidos:°° " + totalv [pos]);


		for (int i = 0; i < fila; i++){
		area.append("\n"+sedes[i]);
		for (int x = 0; x < colum; x++){
		area.append("\n"+candidatos[x]);
		area.append("\t"+votos[i][x]);
		
		 }
		}
		JOptionPane.showMessageDialog(null, scroll);
		
		 }
		}
