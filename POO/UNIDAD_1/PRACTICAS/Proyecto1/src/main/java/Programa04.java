/************************************************************************
 * *
 * TITLE: MULTI-CURRENCY CONVERTER (MXN, USD, EUR, GBP)                 *
 * TÍTULO: CONVERSOR MULTIDIVISA (PESOS, DÓLARES, EUROS, LIBRAS)        *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Read an amount in Pesos (MXN) from the user.
 * 2. Convert Pesos to Dollars (1 USD = 18 MXN).
 * 3. Convert the result to Euros (1 EUR = 1.20 USD).
 * 4. Convert the result to Pounds (1 GBP = 1.05 EUR).
 *
 * ----------------------------------------------------------------------
 * 1. Leer una cantidad en Pesos (MXN) del usuario.
 * 2. Convertir Pesos a Dólares (1 USD = 18 MXN).
 * 3. Convertir el resultado a Euros (1 EUR = 1.20 USD).
 * 4. Convertir el resultado a Libras (1 GBP = 1.05 EUR).
 */
import java.util.Scanner;

public class Programa04 {
    // --- CONSTANTS AND VARIABLES / CONSTANTES Y VARIABLES ---
    static int d = 18;           // Dollar exchange rate / Tipo de cambio Dólar
    static float e = 1.2f;       // Euro exchange rate / Tipo de cambio Euro
    static float l = 1.05f;      // Pound exchange rate / Tipo de cambio Libra
    static int pesos;            // Input amount / Cantidad de entrada
    static float resultado = 0.0f; // Calculation storage / Almacenamiento de cálculos
    
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        // 1. INPUT / ENTRADA
        System.out.println("Escribe una cantidad en pesos:");
        pesos = numeros.nextInt();
        
        // 2. PROCESSING & OUTPUT / PROCESAMIENTO Y SALIDA
        
        // Convert to Dollars
        resultado = (float)pesos / d; 
        System.out.println("Los Dolares son: " + resultado);
        
        // Convert Dollars to Euros
        resultado = resultado / e;
        System.out.println("Los Euros son: " + resultado);
        
        // Convert Euros to Pounds
        resultado = resultado / l;
        System.out.println("Las Libras son: " + resultado);
    }
}