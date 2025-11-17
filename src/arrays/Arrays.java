
package arrays;

import java.util.Scanner;


public class Arrays {


    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final int TAM = 10; // tamaño del vector
        int[] dato = new int[TAM]; //declara el vector y reserva memoria para dicho vector
        int vector [] ;
        
        
        
        for (int i = 0; i < TAM; i++) 
        {
            dato[i] = i +3 ;
            
        }
        System.out.print("Introduzca el tamaño del array :");
        
    }
    
}
