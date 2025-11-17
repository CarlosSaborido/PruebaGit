
package arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        final int TAM = 10;
        char [] simbolo = new char [TAM];
        
        simbolo[0] = 'a';
        simbolo[1] = '@';
        simbolo[4] = 'x';
        simbolo[6] = ' ';
        simbolo[8] = 'p';
        simbolo[9] = '*';
        
        System.out.print("[");
        for (int i = 0; i <  simbolo.length; i++) 
        {  
            System.out.print( simbolo[i] + ((i) < simbolo.length-1? ", ": ""));     
        }
        System.out.print("]\n");
    }
    // Sale el valor nullo o ninguno como el de la posicion 6    
}
