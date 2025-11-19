
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 * Escribe un programa que genere 100 números aleatorios del rango [0,20] y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
generada anteriormente. Los números que se han cambiado deben aparecer entre
comillados
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 100;
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
         System.out.print("\n\t3.-Cargar una posicion del array(mostrar destacado)");
         System.out.print("\n\t4.-Cambiar un valor del array(mostrar destacado)");
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
                    cagarPos(num);
                    break;
                case 4:
                    cargarValor(num);
                    break;

            }
    }
     public static void cargarAleatorio(int [] num_)
     {
         Random aleatorio = new Random();
         
         for (int i = 0; i < num_.length; i++)
         {
          num_[i] = aleatorio.nextInt(20);
         }
     }
     public static void mostrar(int [] num_)
     {
         for (int i = 0; i < num_.length; i++)
         {
            System.out.print(num_[i] + ((i) < num_.length-1? ", " : ""));   
         }
     }
     public static void cagarPos(int [] num_)
     {
         Scanner sc = new Scanner(System.in);
         int pos;
         
         System.out.print("\nIntroduzca posicion: ");
         pos=sc.nextInt();
         System.out.print("\nIntroduzca numero a cambiar: ");
         num_[pos-1] = sc.nextInt();
         
         for (int i = 0; i < num_.length; i++)
         {
             if(i == pos-1)
             {
                System.out.print("*****" +num_[i]+ "*****" + ((i) < num_.length-1? ", " : "")); 
             }
             else
             {
                System.out.print(num_[i] + ((i) < num_.length-1? ", " : ""));  
             }
         }
     }
     public static void cargarValor(int [] num_)
     {
         Scanner sc = new Scanner(System.in);
         int valorPos, valorNum;
         
         System.out.print("\nIntroduzca valor: ");
         valorPos=sc.nextInt();
         System.out.print("\nIntroduzca numero a cambiar: ");
         valorNum=sc.nextInt();
         
         for (int i = 0; i < num_.length; i++)
         {
             if(num_[i] == valorPos)
             {
                 num_[i] = valorNum;
                 System.out.print("*****" +num_[i]+ "*****" + ((i) < num_.length-1? ", " : ""));
             }else
             {
                 System.out.print(num_[i] + ((i) < num_.length-1? ", " : ""));
             }
         }      
     }
}
