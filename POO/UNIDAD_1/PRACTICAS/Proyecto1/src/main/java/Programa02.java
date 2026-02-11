/************************************************************************
 * *
 * TITLE: BASIC OUTPUTS: CONSOLE AND GUI                                *
 * TÍTULO: SALIDAS BÁSICAS: CONSOLA E INTERFAZ GRÁFICA                  *
 * *
 * @author: Marco                                                       *
 * @date: February 2026                                                 *
 * *
 ************************************************************************/

/* PROBLEM DESCRIPTION / DESCRIPCIÓN DEL PROBLEMA:
 * 1. Print a greeting message in the system console.
 * 2. Display the same greeting using a graphical window (Swing).
 *
 * ----------------------------------------------------------------------
 * 1. Imprimir un mensaje de saludo en la consola del sistema.
 * 2. Mostrar el mismo saludo usando una ventana gráfica (Swing).
 */

import javax.swing.JOptionPane;

public class Programa02 {
    public static void main(String[] args) {
        
        // --- CONSOLE OUTPUT / SALIDA POR CONSOLA ---
        // This appears in the IDE's output window (Standard Output)
        // Esto aparece en la ventana de salida del IDE (Salida Estándar)
        System.out.println("holamundo");

        // --- GRAPHICAL OUTPUT / SALIDA GRÁFICA ---
        // This triggers a popup window from the Swing library
        // Esto activa una ventana emergente de la librería Swing
        JOptionPane.showMessageDialog(null, "hola mundo"); 
    }
}