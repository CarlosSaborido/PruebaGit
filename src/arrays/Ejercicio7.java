
package arrays;

import java.util.Scanner;

/*
Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
*/

public class Ejercicio7 {
    public static void menu()
    {
        System.out.println("--Menu de carga(visualizacion de array--");
        System.out.println("\t1.-Carga de datos");
        System.out.println("\t2.-Rotar hacia derecha");
        System.out.println("\t3.-Rotar hacia izquierda");
        System.out.println("\t4.-Mostrar array");
        System.out.println("\t0.-Salir");
        System.out.print("\nOpcion: ");
    }
    public static void mostrar(int _num[])
    {
        for (int i = 0; i < _num.length; i++)
        {
            System.out.print(_num[i] + " ");   
        }
    }
    public static void menuSelect(int select, int []_num)
    {
        switch (select) {
            case 1:
                carga(_num);
                break;
            case 2:
                visualizarRotado(_num);
                break;
            case 3:
                visualizarInversa(_num);
                break;
            case 4:
                mostrar(_num);
                break;
        }
    }
    
    public static void carga(int [] num)
    {
        Scanner teclado = new Scanner(System.in);
                
        for (int i = 0; i < num.length; i++)
        {
            System.out.print("\nIntroduza el dato de la posicion " + i + " :");
          num[i] = teclado.nextInt();
        }
    }
    public static void visualizarRotado(int [] num)
    {
        int aux = num[num.length-1];
        for (int i = num.length-1; i > 0; i--)
        {
         num[i] = num[i-1];
        }
        num[0] = aux;
        
    }
    public static void visualizarInversa(int [] num)
    {
        int aux = num[0];
        for (int i = 0; i < num.length-1; i++)
        {
         num[i]= num[i+1];
         
        }
        num[num.length-1] = aux;
              
    }
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        final int TAM = 4;
        int []num = new int [TAM];
        int select;
        
        do
        {
            menu();
            
            select = teclado.nextInt();
            menuSelect(select, num);
            
            
        }while(select !=0 );
        
        
    }
    
}
