
package arrays;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int []num = new int [10];
        
        
        System.out.println("Introduzca 10 numeros para mostrarlos a la inversa");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print("\nIntroduzca mumerin: ");
            num[i]= teclado.nextInt();
        }
        
        
        System.out.print("[");
        for (int i = num.length-1; i >= 0; i--)
        {
            System.out.print(num[i] + ((i) > 0? ", " : ""));   
        }
        System.out.print("]\n");
    
}}
