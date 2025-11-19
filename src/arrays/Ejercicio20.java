
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el array
?cincuerizado?, según el siguiente criterio: si el número que hay en una posición del array es
múltiplo de 5, se deja igual, y si no, se cambia por el siguiente múltiplo de 5 que exista a
partir de él
 * @author dam1
 */
public class Ejercicio20 
{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 15;
        int [] num = new int [TAM];
        int select;
        
        do
        {
            menu();
            select = sc.nextInt();
            seleccionMenu(select,num);
        }while(select != 0);
    }
    public static void menu()
     {
         System.out.print("\n\t\tMenu rapidito");
         System.out.print("\n\t1.-Cargar datos del array(Aleatorio)");
         System.out.print("\n\t2.-Mostrar el array");
         System.out.print("\n\t3.-Cincuerizar el array");
         System.out.print("\n0.-Salir");
         System.out.print("\n\tEliga su opcion: ");
         
     }
         public static void seleccionMenu(int _seleccion, int [] num)
    {
        
        switch (_seleccion) 
            {
                case 1:
                    cargarAleatorio(num);
                    break;
                case 2:
                    mostrar(num);
                    break;
                case 3:
                    redondear(num);
                    break;

            }
    }
     public static void cargarAleatorio(int [] num_)
     {
         Random aleatorio = new Random();
         
         for (int i = 0; i < num_.length; i++)
         {
          num_[i] = aleatorio.nextInt(501);
         }
     }
     public static void mostrar(int [] num_)
     {
         for (int i = 0; i < num_.length; i++)
         {
            System.out.print(num_[i] + ((i) < num_.length-1? ", " : ""));   
         }
     }   
     public static void redondear(int [] num)
     {
         for (int i = 0; i < num.length; i++) 
         {
             boolean encontrado = true;
             
             if(!(num[i] % 5 ==0))                 
             {
                 for (int j = num[i]; j < num[i]+5 & encontrado; j++)
                 {
                     if(j % 5 ==0)
                     {
                         num[i] = j;
                         
                         encontrado = false;
                     }
                 }
   
             }
         }
     }
}
