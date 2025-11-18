
package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) 
    {
        final int TAM = 10;
        int [] num = new int [TAM];
        int seleccion;
        Scanner teclado = new Scanner(System.in);
        
        do{
            menu();
            seleccion = teclado.nextInt();
            seleccionMenu(seleccion, num);
            
            
        }while(seleccion != 0 );
        
    }
    public static void menu()
    {
        System.out.print("--Menu--");
        System.out.print("\n\t1.-Cargar el array(Aleatorio)");
        System.out.print("\n\t2.-Cargar el array(Manual)");
        System.out.print("\n\t3.-Mostrar");
        System.out.print("\n\t4.-Ordenar por primos");
        System.out.print("\n0.-Salir");
        System.out.print("\nOpcion:");
    }
     
    public static void seleccionMenu(int _seleccion, int [] num)
    {
        
        switch (_seleccion) 
            {
                case 1:
                    cargarAleatorio(num);
                    break;
                case 2:
                    cargarManual(num);
                    break;
                case 3:
                    mostrar(num);
                    break;                
                case 4:
                    primos(num);
                    break;                

            }
    }
    public static void cargarAleatorio(int [] num_)
     {
         Random aleatorio = new Random();
         
         for (int i = 0; i < num_.length; i++)
         {
          num_[i] = aleatorio.nextInt(21);
         }
     }
    public static void cargarManual(int [] _num)
    {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < _num.length; i++)
        {
            System.out.print("\nIntroduzca el numero de la pos " + i + " :");
         _num[i]=teclado.nextInt();
        }
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
    public static void primos(int [] num)
    {
        int [] primos = new int [num.length];
        int [] noPrimos = new int [num.length];
        boolean primo;
        int contPrimos = 0, contNoPrimos = 0 ;
        
        for (int i = 0; i < num.length; i++)
        {
            primo = true;
            
            if(num[i] <= 1)
            {
             primo = false;
            }
         
            
            for (int j = 2; j <= Math.sqrt(num[i]); j++)
            {
                if(num[i] % j == 0)
                {
                    primo = false;
                }
            }
            
            
            if (primo)
            {
                primos[contPrimos] = num[i];
                contPrimos++;
            }
            else
            {
                noPrimos[contNoPrimos] = num[i];
                contNoPrimos++;
            }
        }
        
        
        contNoPrimos = 0;
        
        
        for (int i = contPrimos; i < num.length; i++)
        {
         primos[i] = noPrimos[contNoPrimos];
         contNoPrimos++;
        }
        
        
        for (int i = 0; i < num.length; i++)
        {
         num[i]= primos [i];   
        }
        mostrar(num);
        
    }
}
