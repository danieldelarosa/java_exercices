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

include Swing*

/ *
Arreglos bidimensionales
mostrar en el área de texto solo los elementos de la primera fila
 * /
paquete  javaapplication1 ;

import  javax.swing. * ;

/ **
 * *
* @autor UNISANGIL
 * /
 clase  pública JavaApplication1 {

     Cadena estática salida = " " ;
    / **
     * @param argumenta los argumentos de la línea de comando
     * /
    public  static  void  main ( String [] args ) {
        // TODO la lógica de aplicación del código aquí
int [] [] twoD =  nuevo  int [ 4 ] [ 4 ];
twoD [ 0 ] [ 0 ] =  1 ;  
twoD [ 0 ] [ 1 ] =  2 ;
twoD [ 0 ] [ 2 ] =  3 ;
dosD [ 0 ] [ 3 ] =  4 ;
twoD [ 1 ] [ 0 ] =  5 ;  
twoD [ 1 ] [ 1 ] =  6 ;
twoD [ 1 ] [ 2 ] =  7 ;
twoD [ 1 ] [ 3 ] =  8 ;
Sistema . a cabo . print (twoD [ 0 ] [ 0 ] +  " " );
para ( int i = 0 ; i <= 3 ; i ++ ) {
salida = salida + twoD [ 0 ] [i] +  " \ n " ;
}
JTextArea areaSalida =  new  JTextArea ();
areaSalida . agregar (salida);
// areaSalida.setText (salida);
JOptionPane . showMessageDialog ( nulo , areaSalida, " Suma de Matrices " , JOptionPane . INFORMACIÓN_ MENSAJE );
    }
}