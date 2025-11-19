
package arrays;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        final int TAM = 12;
        double [] temperaturaMes = new double [TAM];
        String [] nombreMes = new String []{"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"} ;
        int seleccion;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
            menu();
            seleccion =sc.nextInt();
            System.out.println("");
            seleccionMenu(seleccion,temperaturaMes,nombreMes);
        }while(seleccion != 0);
    }
    public static void menu()
    {
        System.out.print("\t\n1.- Pedir datos de temperatura");
        System.out.print("\t\n2.- Calcular media");
        System.out.print("\t\n3.- Calcular maxima");
        System.out.print("\t\n4.- Calcular minima");
        System.out.print("\t\n5.- Mostrar el diagrama de temperaturas");
        System.out.print("\t\n6.- Cargar aleatorio");
        System.out.print("\t\n 0.-Salir");
        System.out.print("\nOpcion: ");
    }
    
    public static void seleccionMenu(int select, double [] meses, String []nombreMes)
    {
        switch (select) {
            case 1:
                cargar(meses,nombreMes);
                break;
            case 2:
               media(meses);
                break;
            case 3:
                maximo(meses,nombreMes);
                break;
            case 4:
                minimo(meses,nombreMes);
                break;
            case 5:
                diagrama(meses,nombreMes);
                break;
            case 6:
                cargarAleatorio(meses);
                break;
        }
        
    }
    
    public static void cargar(double [] _meses ,String [] nombreMes)
    {
        Scanner sc = new Scanner(System.in);
 
        
        for (int i = 0; i < _meses.length; i++)
        {
            System.out.print("\nIntroduzca la temperatura que hizo en "+nombreMes[i]+": ");
            
            _meses [i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("");
    }
    public static void maximo(double [] _meses, String [] mes)
    {
        double maximo = _meses[0];
        
        
        for (int i = 0; i < _meses.length; i++)
        {
            if(maximo< _meses[i]) maximo = _meses[i];              
        }
        
        for (int i = 0; i < _meses.length; i++)
        {
            if(maximo == _meses[i]) System.out.println("La maxima temperatura la tiene el mes "+ mes[i] + " con una temperatura de " + maximo+"ºC");
        }
    }
    public static void minimo(double [] _meses, String [] mes)
    {
        double minimo = _meses[0];
        
        
        for (int i = 0; i < _meses.length; i++)
        {
            if(minimo > _meses[i]) minimo = _meses[i];              
        }
        
        for (int i = 0; i < _meses.length; i++)
        {
            if(minimo == _meses[i]) System.out.println("La minima temperatura la tiene el mes "+ mes[i] + " con una temperatura de " + minimo +"ºC");
        }
    }
    public static void media(double [] _tMes)
    {
        double suma = 0;
        
        for (int i = 0; i < _tMes.length; i++)
        {
            suma += _tMes[i];
        }
        System.out.println("La media de la temperatura anual es : " + (suma/_tMes.length+1) + "ºC");
    }
    public static void diagrama (double [] tMes, String [] nMes)
    {
        System.out.println("-------Diagrama de Temperaturas-------");
        
        for (int i = 0; i < tMes.length; i++)
        {
            System.out.print("\n"+ nMes[i]+" || " + tMes[i]+ " || " );
            for (int j = 0; j <= (int) tMes[i] ; j++)
            {
                System.out.print("*");
            }
        }
        System.out.println("\n");
        System.out.println("---------------------");
    }
    public static void cargarAleatorio(double [] tMes)
    {
        Random temperatura = new Random();
        
        double temp;
        
        for (int i = 0; i < tMes.length; i++) 
        {
            temp = (double) (temperatura.nextInt(400)) /10;
            tMes[i] = temp;
        }
        
    }
}
