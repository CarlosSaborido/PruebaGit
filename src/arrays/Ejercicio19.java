
package arrays;

import java.util.Scanner;

/**
 Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia
histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación
recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles
el ordinal correspondiente. Así, por ejemplo, si hay dos Luis en los nombres de los reyes, el
primero debería aparecer como Luis 1º y el segundo como Luis 2º.

 */
public class Ejercicio19 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 12;
        String [] reyes = new String [TAM];
        int select;
        
        do
        {
            menu();
            select = sc.nextInt();
            seleccionMenu(reyes,select);
        }while(select != 0);
    }
     public static void menu()
    {
        System.out.print("\t\n1.- Cargar");
        System.out.print("\t\n2.- Mostrar");
        System.out.print("\t\n3.- Colocar ordinal");
        System.out.print("\t\n 0.-Salir");
        System.out.print("\nOpcion: ");
    }
    
    public static void seleccionMenu(String [] reyes,int select)
    {
        
        switch (select) 
            {
                case 1:
                    cargar(reyes);
                    break;
                case 2:
                    mostrar(reyes);
                    break;    
                case 3:
                    ordinal(reyes);
                    break;    
            }
    }
    public static void cargar(String [] reyes)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca los nombres de los reyes y pulse INTRO:");
        
        for (int i = 0; i < reyes.length; i++) 
        {
            reyes[i] = sc.nextLine();
        }
    }
    public static void mostrar(String [] reyes)
    {
        System.out.println("Los reyes introducidos son:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(reyes[i]);    
        }
        
        
    }
    public static void ordinal(String [] reyes)
    {
        int contador = 0;
        
        
        for (int i = 0; i < reyes.length; i++)
        { contador = 1;
            for (int j = 0; j < i; j++)
            {
                if(reyes[i].equals(reyes[j])) contador++;
                
            }
            System.out.println(reyes[i]+ " " + contador + "*" );
        }
    }
}
