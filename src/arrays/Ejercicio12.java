
package arrays;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int TAM = 8;
        String [] palabras = new String [TAM];        
        String [] aux = new String [TAM];
        int seleccion;
        
        Scanner teclado = new Scanner(System.in);
        
       
      do
      {
          menu();
          seleccion = teclado.nextInt();
          seleccionMenu(seleccion, palabras);
          
      }while(seleccion != 0);
        
    }
    public static void menu()
     {
         System.out.print("\n\t\tMenu rapidito");
         System.out.print("\n\t1.-Cargar palabras en el array");
         System.out.print("\n\t2.-Mostrar el array)");
         System.out.print("\n\t3.-Ordenar el array (colores primero)");         
         System.out.print("\n0.-Salir");
         System.out.print("\n\tEliga su opcion: ");
         
     }
    public static void seleccionMenu(int _seleccion, String [] _palabras)
    {
        
        switch (_seleccion) 
            {
                case 1:
                    cargar(_palabras);
                    break;
                case 2:
                    mostrar(_palabras);
                    break;
                case 3:
                    ordenar(_palabras);
                    break;         
            }
    }
    public static void cargar(String [] _palabras)
    {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < _palabras.length ; i++)
        {
         System.out.println("Introduzca la palabra de la posicion "+ i + " :");
         _palabras[i] =teclado.nextLine();    
        }
                
    }
    public static void mostrar(String [] _palabras)
    {
        for (int i = 0; i < _palabras.length; i++) {
           System.out.print(_palabras[i]+ ((i) < _palabras.length-1? ", ": "")); 
            
        }
    }
    public static void ordenar(String [] _palabras)
    {
        String [] colores = new String [] {"azul","verde","rojo","amarillo","naranja","rosa","negro","blanco","morado"};
        
        String [] auxiliar = new String [_palabras.length];
        String [] aux2 = new String [_palabras.length];
        int contadorColores = 0, contadorRandom =0;
        boolean encontrado;
        
        for (int i = 0; i < _palabras.length ; i++)
        {
            encontrado = false;
            
            for (int j = 0; j < colores.length && !encontrado; j++) 
            {
                if(_palabras[i].equals(colores[j]))
                {
                    encontrado = true ;
                    break;
                }
                
            }
            
            
            if (encontrado)
            {
                auxiliar[contadorColores] = _palabras[i];
                contadorColores++;
            }
            else
            {
                aux2[contadorRandom] = _palabras[i];
                contadorRandom++;
                        
            }
                
            
        }
        /*
        System.out.println("nexxxx");
        for (int i = 0; i < contadorRandom; i++)
        {
            System.out.print(" "+aux2[i]);    
        }
        System.out.println("nextt");
        for (int i = 0; i < contadorColores; i++)
        {
            System.out.print(" "+ auxiliar[i]);    
        }
        */
        contadorRandom=0;
        
        for (int i = contadorColores; i < _palabras.length ; i++)
        {
            auxiliar[i] = aux2[contadorRandom];
            contadorRandom++;
        }
        
        for (int i = 0; i < _palabras.length; i++)
        {
          _palabras[i] = auxiliar[i];   
        }
        for (int i = 0; i < _palabras.length; i++) 
        {
           System.out.print(_palabras[i]+ ((i) < _palabras.length-1? ", ": "")); 
        }
        
    }
}
