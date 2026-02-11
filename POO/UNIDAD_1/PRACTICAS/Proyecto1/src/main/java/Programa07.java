/************************************************************************
 * *
 * TITLE: COMPREHENSIVE DATA HANDLING AND MATH OPERATIONS               *
 * TÍTULO: MANEJO INTEGRAL DE DATOS Y OPERACIONES MATEMÁTICAS           *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/
/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Capture multiple data types using Scanner and BufferedReader.
 * 2. Demonstrate the difference between float and double precision.
 * 3. Calculate an accurate average using explicit casting.
 * 4. Apply square root and power functions from the Math class.
 *
 * ----------------------------------------------------------------------
 * 1. Capturar múltiples tipos de datos usando Scanner y BufferedReader.
 * 2. Demostrar la diferencia entre la precisión float y double.
 * 3. Calcular un promedio preciso usando casteo explícito.
 * 4. Aplicar funciones de raíz cuadrada y potencia de la clase Math.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programa07 {
    // --- STATIC CLASS MEMBERS / MIEMBROS ESTÁTICOS ---
    static int n1;
    static int n2;

    public static void main(String[] args) throws IOException {
        
        // --- TOOL INITIALIZATION / INICIALIZACIÓN ---
        Scanner leer = new Scanner(System.in);
        BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));        
        
        // --- INPUT SECTION / ENTRADA ---
        System.out.println("Escribe el nombre: ");
        String nombre = escribir.readLine();
        
        System.out.println("Ingresa el primer numero: ");
        int a = leer.nextInt(); 
        
        System.out.println("Ingresa el segundo numero: ");
        int b = leer.nextInt(); 
        
        System.out.println("Escribe el tercer numero (Decimal): ");
        float c = leer.nextFloat(); 
        
        System.out.println("Escribe el cuarto numero (Decimal doble): ");
        double d = leer.nextDouble();
        
        // --- PROCESSING / PROCESAMIENTO ---
        
        // Accurate average with explicit casting to float
        // Promedio preciso con casteo explícito a float
        float resultado = ( (float)a + (float)b + (float)c + (float)d ) / 4;
        
        // Square root / Raíz cuadrada
        double c1 = Math.sqrt(c);
        
        // Power / Potencia (d^2)
        double c2 = Math.pow(d, 2);
        
        // --- OUTPUT SECTION / SALIDA ---
        System.out.println("Nombre: " + nombre);
        System.out.println("El promedio final es: " + resultado);
        System.out.println("Raíz cuadrada del 3ro: " + c1);
        System.out.println("Potencia del 4to al cuadrado: " + c2);
    }
}