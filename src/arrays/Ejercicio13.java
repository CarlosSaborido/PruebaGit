
package arrays;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        final int TAM = 10;
        int [] mesas = new int [TAM];
        int comensales;
        Scanner teclado = new Scanner(System.in);
        
        
        do
        {
            tabla(mesas);
            System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa): ");
            comensales = teclado.nextInt();
            if(comensales>0){
            sitio(mesas, comensales);
            }
        }while(comensales != -1);
    }
    
    
    public static void tabla(int [] _mesas)
    {
        System.out.print("mesa nº----->>");
        for (int i = 0; i <  _mesas.length; i++) 
        {  
            System.out.print("\t"+ (i+1));     
        }
        System.out.println("");
        System.out.print("Ocupacion--->>");
        for (int i = 0; i <  _mesas.length; i++) 
        {  
            System.out.print("\t"+ _mesas[i]);     
        }
        System.out.println("");
    }
    
    public static void sitio(int [] _mesas, int comensales)
    {
        boolean sitio = true;
        
        if (comensales > 4)
        {
            System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
        }
        else
        {
            for (int i = 0; i < _mesas.length; i++)
            {
                if(_mesas[i] == 0)
                {
                    System.out.println("Por favor, sientese en la mesa numero " + (i+1) +".");
                    _mesas[i] = comensales;
                    sitio = false;
                    break;
                }        
            }
            
            if(sitio)
            {
                for (int i = 0; i < _mesas.length; i++)
                {
                    if((comensales + _mesas[i])<5){           
                    System.out.print("Tendran que compartir mesa. ");
                    System.out.println("Por favor, sientese en la mesa numero " + (i+1) +".");
                    _mesas[i] = (comensales + _mesas[i]);
                    sitio = false;
                    break;
                    }
                    else
                    {
                        if(i== (_mesas.length-1)) System.out.println("Lo siento, en estos momentos no queda sitio"); 
                    }
                }
            }
            
           /* if(!sitio)
            {
                System.out.println("Lo siento, en estos momentos no queda sitio");
            }*/
        }
    }
}
