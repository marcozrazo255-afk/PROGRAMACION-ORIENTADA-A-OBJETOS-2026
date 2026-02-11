/************************************************************************
 * *
 * TITLE: POSITIVE INTEGERS MATH PROCESSOR                              *
 * TÍTULO: PROCESADOR MATEMÁTICO DE ENTEROS POSITIVOS                   *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * * 1. Request 5 positive integers from the user.
 * 2. Calculate the product of the first 3 numbers.
 * 3. Raise the 4th number to the power of the 5th.
 * 4. Calculate the average of the last 3 numbers.
 * 5. Display all results in a single JOptionPane message.
 *
 * ----------------------------------------------------------------------
 * Pedir 5 números enteros positivos al usuario.
 * 1. Calcular el producto de los primeros 3 números.
 * 2. Elevar el 4to número a la potencia del 5to.
 * 3. Calcular el promedio de los últimos 3 números.
 * 4. Mostrar todos los resultados en un solo mensaje de JOptionPane.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PreExamen { 

    // --- GLOBAL VARIABLES / VARIABLES GLOBALES ---
    static int n1, n2, n3, n4, n5; 
    static int producto; 
    static double potencia; // Required for Math.pow precision
    static float promedio;  // Suitable for decimal results

    public static void main(String[] args) { 

        Scanner leer = new Scanner(System.in); 
        
        // 1. INPUT / ENTRADA
        System.out.println("Escribe 5 numeros:"); 
        n1 = leer.nextInt(); 
        n2 = leer.nextInt(); 
        n3 = leer.nextInt(); 
        n4 = leer.nextInt(); 
        n5 = leer.nextInt(); 

        // 2. PROCESSING / PROCESAMIENTO
        
        // Multiplicación de enteros
        producto = n1 * n2 * n3; 
        
        // Operación de potencia (devuelve double)
        potencia = Math.pow(n4, n5); 
        
        // Promedio de los últimos 3 (Advertencia: división entera)
        promedio = (n3 + n4 + n5) / 3; 

        // 3. OUTPUT / SALIDA
        JOptionPane.showMessageDialog(null, 
            "--- RESULTADOS / RESULTS ---" +
            "\nProducto (1, 2, 3): " + producto + 
            "\nPotencia (4^5): " + potencia + 
            "\nPromedio (3, 4, 5): " + promedio);
            
        leer.close(); // Cierre del recurso
    } 
}