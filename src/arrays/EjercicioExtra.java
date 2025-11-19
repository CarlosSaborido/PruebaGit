
package arrays;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class EjercicioExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int select;
        String car;
        do
        {
            menu();
            select = sc.nextInt();
            sc.nextLine();
            
            System.out.print("\nIntroduzca caracter para pintar las figuras: ");
            car=sc.nextLine();
            
            sc.nextLine();
            seleccionMenu(select,car);
        }while(select != 0);
    }
    public static void menu()
     {
         System.out.print("\n\t\tMenu de figuras");
         System.out.print("\n\t1.-Reloj de arena");
         System.out.print("\n\t2.-Rombo");
         System.out.print("\n\t3.-Triangulo invertido(relleno)");
         System.out.print("\n\t3.-Triangulo invertido(vacio)");
         System.out.print("\n0.-Salir");
         System.out.print("\n\tEliga su opcion: ");
         
     }
    
    public static void seleccionMenu(int select,String car)
    {
        
        switch (select) 
            {
                case 1:
                    reloj(car);
                    break;
                case 2:
                    rombo(car);
                    break;
                case 3:
                    trianguloRelleno(car);
                    break;         
                case 4:
                    trianguloVacio(car);
                    break;         
            }
    }
    public static void reloj(String _car)
    {
        
    }
    public static void rombo(String _car)
    {
        Scanner in = new Scanner(System.in);
        //impar >= 3
        
        int altura, vacios = 0, asteriscos = -1;
        
        
        
        System.out.println("Introduzca la altura del rombo(Impar y >=3):");
        altura = in.nextInt();
        in.nextLine();
        
        
        
        if(altura < 3 || altura % 2 == 0)
        {
            System.out.println("Error.");
        }
        else
        {
            vacios =(int)(altura/2)-1;
            for (int i = 0; i < altura; i++)
            {
                for (int j = 0; j <= vacios; j++)
                {
                    System.out.print(" ");
                }
                if (i == 0 || i == (altura-1))
                {
                    System.out.print("");
                }
                else
                {
                    System.out.print(_car);
                    
                }
             //   (i == 0 || i == altura) ? System.out.print("*") : System.out.print("") ;
                for (int j = 0; j < asteriscos; j++) {
                    System.out.print(" ");
                }
                System.out.println(_car);
                if( i < altura/2)
                {
                    vacios--;
                    asteriscos = asteriscos + 2;
                }
                else
                {
                    vacios++;
                    asteriscos = asteriscos -2 ;
                    
                }
            }
        }
    }
    public static void trianguloRelleno(String _car)
    {
        Scanner sc = new Scanner(System.in);
        
        int altura;
        
        System.out.print("\nIntroduzca la altura del triangulo: ");
        altura = sc.nextInt();
        
        for (int fila = 1; fila <= altura; fila++) 
        {
            for (int columna = 1; columna <= fila-1; columna++)
            {
                System.out.print(" ");   
            }
            
            for (int i = 1; i <= ((altura-fila)*2-1) ; i++)
            {
                System.out.print(_car);
            }
            System.out.println(" ");
        }
    }
    public static void trianguloVacio(String _car)
    {
        
    }
}
