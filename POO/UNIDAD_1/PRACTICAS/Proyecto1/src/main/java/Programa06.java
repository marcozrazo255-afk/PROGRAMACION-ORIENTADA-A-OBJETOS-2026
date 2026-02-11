/************************************************************************
 * *
 * TITLE: ARITHMETIC MEAN AND INTEGER DIVISION                          *
 * TÍTULO: PROMEDIO ARITMÉTICO Y DIVISIÓN DE ENTEROS                    *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Initialize 4 integer variables with specific values.
 * 2. Calculate the average (mean) of these numbers.
 * 3. Store the result in a float variable and display it.
 *
 * ----------------------------------------------------------------------
 * 1. Inicializar 4 variables enteras con valores específicos.
 * 2. Calcular el promedio de estos números.
 * 3. Guardar el resultado en una variable float y mostrarlo.
 */
public class Programa06 {
    public static void main(String[] args) {
        // --- VARIABLE INITIALIZATION / INICIALIZACIÓN ---
        int n1 = 22, n2 = 12, n3 = 15, n4 = 91; 
        float prom;

        // --- CALCULATION / CÁLCULO ---
        // Warning: (int + int + int + int) / int results in an int (integer division)
        // Advertencia: (int + int + int + int) / int resulta en un entero (división entera)
        prom = (n1 + n2 + n3 + n4) / 4;

        // --- OUTPUT / SALIDA ---
        System.out.println("Promedio: " + prom);
    }
}