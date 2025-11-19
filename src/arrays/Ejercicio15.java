
package arrays;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio15 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 20;
        int [] num = new int [TAM];
        int select;
        do
        {
            menu();
            select=sc.nextInt();
            System.out.println("");
            seleccionMenu(num, select);
            
        }while(select != 0);
    }
    
    public static void menu()
    {
        System.out.print("\t\n1.- Cargar aleatorio(0,20)");
        System.out.print("\t\n2.- Mostrar tabla");
        System.out.print("\t\n3.- Pares primero");
        System.out.print("\t\n 0.-Salir");
        System.out.print("\nOpcion: ");
    }
    public static void seleccionMenu(int [] num,int select)
    {
        
        switch (select) 
            {
                case 1:
                    cargarAleatorio(num);
                    break;
                case 2:
                    mostrar(num);
                    break;
                case 3:
                    ordenar(num);
                    break;         
            }
    }
    public static void cargarAleatorio(int [] _num)
    {
        Random aleatorio = new Random();
        
        for (int i = 0; i < _num.length; i++)
        {
         _num[i] =  aleatorio.nextInt(21);
        }
    }
    public static void mostrar(int [] _num)
    {
        for (int i = 0; i < _num.length; i++)
        {
            System.out.print( _num[i] + ((i) < _num.length-1? ", ": ""));  
        }
    }
    public static void ordenar(int [] _num)
    {
        int [] par = new int [_num.length];
        int [] impar = new int [_num.length];
        int contPar =0, contImpar = 0;
        
        for (int i = 0; i < _num.length; i++)
        {
          if(_num[i] % 2 == 0)
          {
            par[contPar] = _num[i];
            contPar++;
          }
          else
          {
            impar[contImpar] = _num[i];
            contImpar++;
          }
        }
        
        contImpar=0;
        for (int i = contPar; i < _num.length; i++)
        {
         par[i]= impar[contImpar];
         contImpar++;
        }
        
        for (int i = 0; i < _num.length; i++)
        {
         _num[i] = par[i];  
        }
    }
    
}
