/************************************************************************
 * *
 * TITLE: DATA TYPES AND INPUT METHODS (SCANNER & BUFFEREDREADER)       *
 * TÍTULO: TIPOS DE DATOS Y MÉTODOS DE ENTRADA                          *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Capture different data types (String, float, char, int).
 * 2. Experiment with Scanner and BufferedReader for input.
 * 3. Handle potential I/O exceptions in the main method.
 *
 * ----------------------------------------------------------------------
 * 1. Capturar diferentes tipos de datos (String, float, char, int).
 * 2. Experimentar con Scanner y BufferedReader para la entrada.
 * 3. Manejar posibles excepciones de E/S en el método principal.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programa03 {
    // --- STATIC ATTRIBUTES / ATRIBUTOS ESTÁTICOS ---
    // Using private static for class-level scope
    private static String nombre;  // Text / Texto
    private static float estatura; // Decimal (32-bit)
    private static char sexo;     // Single character / Carácter único
    private static int edad;       // Integer / Entero

    public static void main(String[] args) throws IOException { 
        
        // --- METHOD 1: SCANNER (Currently active for Name, Height, Age) ---
        Scanner leer = new Scanner(System.in);

        // --- METHOD 2: BUFFEREDREADER (Currently active for Gender) ---
        BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));
      
        // 1. Reading String with Scanner
        System.out.println("Escribe un nombre:");
        nombre = leer.nextLine();

        // 2. Reading float with Scanner
        System.out.println("Escribe la estatura de una persona:");
        estatura = leer.nextFloat();

        // 3. Reading char with BufferedReader
        // Note: .readLine() gets a string, .charAt(0) takes the first letter
        System.out.println("Escribe el sexo (M/F):");
        sexo = escribir.readLine().charAt(0);

        // 4. Reading int with Scanner
        System.out.println("Escribe la edad:");
        edad = leer.nextInt();
        
        // --- NOTE ON METHOD 3: JOPTIOPANE (Commented out in original) ---
        /* The JOptionPane method requires parsing (Integer.parseInt, etc.) 
           because it treats everything as String by default. */
    }
}