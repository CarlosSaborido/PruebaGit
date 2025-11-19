/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos
incluidos y que los almacene en un array. A continuación, el programa debe mostrar el
contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe colocar de
forma alterna y en orden los menores o iguales de 100 y los mayores de 100: primero menor,
luego mayor, luego menor, luego mayor… Cuando se acaben los menores o los mayores, se
completará con los números que queden.

 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 10;
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
        System.out.print("\t\n3.- Ordenar (alternos)");
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
    public static void ordenar(int[] _num)
    {
        int [] menores = new int [_num.length];
        int [] mayores = new int [_num.length];
        int contMayores = 0 , contMenores = 0;
        
                
        for (int i = 0; i < _num.length; i++)
        {
            if(_num[i] <= 100)
            {
                menores[contMenores] = _num[i];
                contMenores++;
            }
            else
            {
                mayores[contMayores] = _num[i];
                contMayores++;
            }
        }
        contMayores=0;
        contMenores=0;
        for (int i = 0; i < _num.length; i++)
        {
            if(i % 2 ==0)
            {
                _num[i] = menores[contMenores];
                contMenores++;
            }
            else
            {
                _num[i] = mayores[contMayores];
                contMayores++;
            }
        }
        mostrar(_num);
    }
}
