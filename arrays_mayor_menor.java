import java.util.Scanner;
  public class array2 {
    public static void main(String[]args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese el tamanio del arreglo");
        int tam = sc.nextInt();
        int[]nums = new int[tam];
        System.out.println("Ingrese los " + tam +" numeros");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int mayor = nums[0]; //mayor momentaneo por defecto
        int menor = nums[0]; //menor momentaneo por defecto
        int num = 0;
        for(int i = 0; i < nums.length; i++) {
            num = nums[i];
            if(num > mayor)  // żactual numero es mayor al "mayor" que tengo almacenado?
                mayor = num; // si es mayor reemplazar, ahora tengo un nuevo mayor
            if(num < menor)  // żactual numero es menor al "menor" que tengo almacenado?
                menor = menor; //si es menor reemplazar, ahora tengo un nuevo menor
        }
        int cantMayor = 0;
        int cantMenor = 0;
        for(int j = 0; j < nums.length; j++) {
            num = nums[j];
            if(num == mayor)
                cantMayor++;
            if(num == menor)
                cantMenor++;
        }
        System.out.println();
        System.out.println("El mayor numero es: " + mayor + " y se repite  "+ cantMayor + " veces");
        System.out.println("El menor numero es: " + menor + " y se repite  "+ cantMenor + " veces");
    }
  }
