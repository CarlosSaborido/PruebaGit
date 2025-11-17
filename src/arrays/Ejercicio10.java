
package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) 
    {
        final int TAM = 100;
        int [] num = new int [TAM];
        int seleccion;
        
        Scanner teclado = new Scanner(System.in);
        
        do
        {
            menu();
            seleccion = teclado.nextInt();
            seleccionMenu(seleccion, num);
        }while(seleccion != 0); 
        
    }
    
    
     public static void menu()
     {
         System.out.print("\t\tMenu rapidito");
         System.out.print("\n\t1.-Cargar datos del array(Aleatorio)");
         System.out.print("\n\t2.-Mostrar el array");
         System.out.print("\n\t3.-Mostrar minimo del array");
         System.out.print("\n\t4.-Mostrar maximo del array");
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
                    minimo(num);
                    break;
                case 4:
                    maximo(num);
                    break;

            }
    }
     public static void cargarAleatorio(int [] num_)
     {
         Random aleatorio = new Random();
         
         for (int i = 0; i < num_.length; i++)
         {
          num_[i] = aleatorio.nextInt(999);
         }
     }
      public static void mostrar (int[] _num)
    {
        System.out.print("[");
        for (int i = 0; i <  _num.length; i++) 
        {  
            System.out.print( _num[i] + ((i) < _num.length-1? ", ": ""));     
        }
        System.out.print("]\n");
    }
     public static void minimo(int [] num_)
     {
         int minimo = num_[0];
         
         for (int i = 0; i < num_.length; i++)
         {
           if(minimo > num_[i])
           {
               minimo = num_[i];
           }
         }
         
          System.out.print("[");
         for (int i = 0; i < num_.length; i++)
         {
          if(minimo == num_[i])
          {
               System.out.print( "--->**" +num_[i]+ "**<---" + ((i) < num_.length-1? ", ": "")); 
          }
          else
          {
               System.out.print(num_[i]+ ((i) < num_.length-1? ", ": "")); 
          }
             
         }
           System.out.print("]\n");
     }
     public static void maximo(int [] num_)
     {
         int maximo = num_[0];
         
         for (int i = 0; i < num_.length; i++)
         {
           if(maximo < num_[i])
           {
               maximo = num_[i];
           }
         }
         
          System.out.print("[");
         for (int i = 0; i < num_.length; i++)
         {
          if(maximo == num_[i])
          {
               System.out.print( "--->**" +num_[i]+ "**<---" + ((i) < num_.length-1? ", ": "")); 
          }
          else
          {
               System.out.print(num_[i]+ ((i) < num_.length-1? ", ": "")); 
          }
             
         }
           System.out.print("]\n");
     }
     
}
