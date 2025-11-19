
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *Realiza un programa que sea capaz de insertar un número en una posición concreta de un
array. En primer lugar, el programa generará un array de 12 números enteros aleatorios entre
0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al
índice (0 – 11). Seguidamente el programa preguntará por el número que se quiere insertar y
por la posición donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se
perderá.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 12;
        int [] num = new int [TAM];
        int select;
        
        do
        {
            menu();
            select = sc.nextInt();
            seleccionMenu(num,select);
        }while(select != 0);
    }
    public static void menu()
    {
        System.out.print("\t\n1.- Cargar aleatorio(0,20)");
        System.out.print("\t\n2.- Mostrar tabla");
        System.out.print("\t\n3.- Insertar numero(Desplazar derecha)");
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
                    cargarPosicion(num);
                    break;         
            }
    }
     public static void cargarAleatorio(int [] _num)
    {
        Random aleatorio = new Random();
        
        for (int i = 0; i < _num.length; i++)
        {
         _num[i] = aleatorio.nextInt(201);   
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
     public static void cargarPosicion(int [] num)
     {
         Scanner sc = new Scanner(System.in);
         
         int pos,numeroIntroducido;
         
         System.out.print("\nIntroduzca el numero de la posicion que desea cambiar: ");
         pos = sc.nextInt();
         sc.nextLine();
         System.out.print("\nIntroduzca el numero para la posicion " + pos+": ");
         numeroIntroducido = sc.nextInt();
         sc.nextLine();
         
         //desplazar a la derecha desde pos
        for (int i = num.length-1; i > pos; i--)
        {
         num[i] = num[i-1];
        }
        num[pos] = numeroIntroducido;
         
     }
}
