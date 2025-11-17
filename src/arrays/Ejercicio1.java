
package arrays;

import java.util.Scanner;





public class Ejercicio1 
{
    
    public static void mostrar (int[] _vector, int _tamaño)
{
    for (int i = 0; i <  _tamaño; i++) 
    {  
        System.out.print( _vector[i] + "--");     
    }
}
        public static void mostrarInversa (int[] _vector, int _tamaño)
{
    for (int i = _tamaño-1; i >= 0; i--)
        {
            System.out.print( _vector[i] + "--"); 
        }
}
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final int TAM = 4;
        int num[] = new int[TAM];
        

        
        
        for (int i = 0; i < TAM; i++) 
        {
            System.out.print("\nIntroduzca numeros para el array: ");
            num[i] = teclado.nextInt();
        }
        
        System.out.println("");

        mostrar(num, TAM);
        
        System.out.println("");
        
        for (int i = TAM-1; i >= 0; i--)
        {
            System.out.print( num[i] + "--"); 
        }
    }
    
}
