
package arrays;

import java.util.Scanner;


public class Ejercicios123 {
    
    public static void menu()
    {
        System.out.println("\t Seleccione una opcion");
        System.out.println("\t1.- Cargar datos del array");
        System.out.println("\t2.- Mostrar datos");
        System.out.println("\t3.- Mostrar datos - Inversa");
        System.out.println("\t4.- Cambiar dato de una posicion ");
        System.out.println("\t 0.-Salir");
        System.out.print("\nEliga una opción:");
        
    }
    
    public static void seleccionMenu(int _seleccion, int [] num)
    {
        
        switch (_seleccion) 
            {
                case 1:
                    cargar(num);
                    break;
                case 2:
                    mostrar(num);
                    break;
                case 3:
                    mostrarInversa(num);
                    break;
                case 4:
                    cargarPosicion(num);
                    break;
            }
    }
    public static void cargar (int [] _num)
    {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < _num.length; i++)
        {
            System.out.print("\nIntroduzca la posicion " + i + " :");
            _num[i] = teclado.nextInt();
        }
    }
    public static void mostrar (int[] _vector)
    {
        System.out.print("[");
        for (int i = 0; i <  _vector.length; i++) 
        {  
            System.out.print( _vector[i] + ((i) < _vector.length-1? ", ": ""));     
        }
        System.out.print("]\n");
    }
    
    public static void mostrarInversa(int [] _vector)
    {
        System.out.print("[");
        for (int i = _vector.length-1; i >= 0; i--)
        {
            System.out.print(_vector[i] + ((i) > 0? ", " : ""));   
        }
        System.out.print("]\n");
    }
    public static void cargarPosicion(int []_num)
    {
        Scanner teclado = new Scanner(System.in);
        int _pos ;
        System.out.print("\nIntroduzca posicion a cambiar en el array: ");
        _pos = teclado.nextInt();
        System.out.print("\nIntroduzca dato a cambiar: ");
        _num[_pos] = teclado.nextInt();
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final int TAM = 11;
        int num[] = new int [TAM];
        int seleccion ;
        
        
        do
        {
            menu();
            seleccion = teclado.nextInt();
            
            seleccionMenu(seleccion, num );
            
        }while(seleccion != 0 );
    }
}
