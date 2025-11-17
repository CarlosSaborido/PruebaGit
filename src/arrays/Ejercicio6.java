
package arrays;


import java.util.Random;

public class Ejercicio6 {
    /* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y
cubo. Carga el array numero con valores aleatorios del rango [ 0, 100). En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
En el array cubo se deben almacenar los cubos de los valores que hay en numero. A
continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.*/
    
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        final int TAM = 20;
        int [] numero = new int [TAM];
        int [] cuadrado = new int [TAM];
        int [] cubo = new int [TAM];
        
       // establecer el array "numero" con numeros aleatorios
        for (int i = 0; i < numero.length; i++)
        {
            numero[i] = random.nextInt(100);
        }
        
        //copiar el array "numero" a "cuadrado" elevandolo a 2
        for (int i = 0; i < numero.length; i++)
        {
          cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        
        //copiar el array "numero" a "cubo" elevandolo a 3
        for (int i = 0; i < numero.length; i++)
        {
         cubo[i] = (int) Math.pow(numero[i], 3);
        }
        
        
        //mostrar las columnas
        System.out.print("Numero\tCuadrado\tCubo");
        //mostrar los 3 arrays en columnas
        for (int i = 0; i < numero.length; i++)
        {
            System.out.print("\n" +numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);   
        }
        System.out.println("");
    }
    
}
