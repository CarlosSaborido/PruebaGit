
package arrays;

import java.util.Random;

public class EntornoArray {
    public static void main(String[] args) {
        final int TAM = 10;
        int [] num = new int [TAM];
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < num.length; i++)
        {
         num[i] = aleatorio.nextInt(20);
        }
        
        mostrar(num);
        
    }
    public static void mostrar (int[] _num)
    {
        
        System.out.print("Indice-->>");
        for (int i = 0; i <  _num.length; i++) 
        {  
            System.out.print("\t"+ i);     
        }
        System.out.println("");
        System.out.print("Valor--->>");
        for (int i = 0; i <  _num.length; i++) 
        {  
            System.out.print("\t"+ _num[i]);     
        }
        System.out.println("");
    }
}
