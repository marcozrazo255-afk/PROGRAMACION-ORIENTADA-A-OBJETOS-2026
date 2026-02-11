/************************************************************************
 * *
 * TITLE: ARITHMETIC OPERATORS AND MATHEMATICAL POWERS                  *
 * TÍTULO: OPERADORES ARITMÉTICOS Y POTENCIAS MATEMÁTICAS               *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Understand the behavior of arithmetic operations between types.
 * 2. Capture a base number and its exponent from the user.
 * 3. Calculate the power using the Math.pow method.
 * 4. Ensure proper resource management by closing the Scanner.
 *
 * ----------------------------------------------------------------------
 * 1. Comprender el comportamiento de operaciones aritméticas entre tipos.
 * 2. Capturar un número base y su exponente del usuario.
 * 3. Calcular la potencia utilizando el método Math.pow.
 * 4. Asegurar el manejo de recursos cerrando el Scanner.
 */

import java.util.Scanner;

public class Programa05 {
    
    public static void main(String[] args) {
        // --- DATA TYPE DOCUMENTATION / DOCUMENTACIÓN DE TIPOS ---
        /* int + int = int
           float + float = float
           double + double = double
           String + String = Concatenation
           Math.sqrt = Square Root / Raíz Cuadrada
           Math.pow = Power / Potencia
        */

        Scanner leer = new Scanner(System.in);
        double numero;
        double potencia;
        double resultado = 0.0;
        
        // 1. INPUT / ENTRADA
        System.out.println("Escribe un numero base: ");
        numero = leer.nextDouble();
        
        System.out.println("Escribe la potencia: ");
        potencia = leer.nextDouble();
        
        // 2. PROCESSING / PROCESAMIENTO
        // Math.pow always returns and requires double for precision
        // Math.pow siempre devuelve y requiere double por precisión
        resultado = Math.pow(numero, potencia);
        
        // 3. OUTPUT / SALIDA
        System.out.println("El resultado de la potencia es: " + resultado);
    
        // 4. RESOURCE MANAGEMENT / CIERRE DE RECURSOS
        leer.close();
    }
}