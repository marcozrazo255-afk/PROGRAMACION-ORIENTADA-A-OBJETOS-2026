
/************************************************************************
 * *
 * TITLE: GLOBAL VARIABLE SCOPE & STATIC METHODS                        *
 * TÍTULO: ÁMBITO DE VARIABLES GLOBALES Y MÉTODOS ESTÁTICOS             *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Declare a global (class-level) variable using a small data type.
 * 2. Access and print the variable from the main method.
 * 3. Create a secondary static method to demonstrate variable persistence.
 *
 * ----------------------------------------------------------------------
 * 1. Declarar una variable global (a nivel de clase) usando un tipo de dato pequeño.
 * 2. Acceder e imprimir la variable desde el método main.
 * 3. Crear un método estático secundario para demostrar la persistencia de la variable.
 */

public class Programa01 {
    // --- VARIABLE DECLARATION / DECLARACIÓN DE VARIABLES ---
    // 'byte' saves memory (8 bits). 'static' allows access from static methods.
    // 'byte' ahorra memoria (8 bits). 'static' permite el acceso desde métodos estáticos.
    static byte a = 10;

    // --- MAIN METHOD / MÉTODO PRINCIPAL ---
    public static void main(String[] args) {
        // Direct access to the global variable
        // Acceso directo a la variable global
        System.out.println("Value in main / Valor en main: " + a);
        
        // Calling the secondary method
        // Llamada al método secundario
        Mostrar();
    }

    // --- SECONDARY METHOD / MÉTODO SECUNDARIO ---
    public static void Mostrar() {
        // The variable 'a' is visible here because it's a class member
        // La variable 'a' es visible aquí porque es un miembro de la clase
        System.out.println("Value in Mostrar / Valor en Mostrar: " + a);
    }
}