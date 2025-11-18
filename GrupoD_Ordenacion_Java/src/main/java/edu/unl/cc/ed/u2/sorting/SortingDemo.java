package edu.unl.cc.ed.u2.sorting;

/**
 * Se encarga de ejecutar los algoritmos de ordenamiento,
 * además imprime los resultados en consola y los carga dentro de dos archivos .txt:
 * uno para resultados finales y otro para trazas paso a paso.
 * @author Steeven Pardo, Darwin Correa
 */

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class SortingDemo {

    public static void main(String[] args) {
        int[][] conjuntosDeDatos = {
                {8, 3, 6, 3, 9},
                {5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5},
                {2, 2, 2, 2},
                {9, 1, 8, 2},
                {-3, -1, 0, 2},
                {5, 9, -4, 0, -1, 1, -2},
                {1},
                {},
        };
        String[] nombres = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        try (
                PrintWriter salida = new PrintWriter("resultados.txt");
                PrintWriter trazas = new PrintWriter("resultadosTrazas.txt")
        ) {
            imprimir(salida, "---BIENVENIDO---");
            imprimir(salida, "---TALLER 5: GRUPO D---");

            imprimir(salida, "=== Ordenamiento usando el algoritmo de Inserción ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(salida, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                InsertionSort.ordenar(copia); // sin trazas
                imprimir(salida, "Resultado final: " + Arrays.toString(copia));
                imprimir(salida, "");
            }

            imprimir(trazas, "=== Algoritmo de Inserción mediante trazas ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(trazas, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                InsertionSort.ordenar(copia, true, trazas); // con trazas
                imprimir(trazas, "Resultado final: " + Arrays.toString(copia));
                imprimir(trazas, "");
            }

            imprimir(salida, "=== Ordenamiento usando el algoritmo de Selección ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(salida, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                SelectionSort.ordenar(copia); // sin trazas
                imprimir(salida, "Resultado final: " + Arrays.toString(copia));
                imprimir(salida, "");
            }

            imprimir(trazas, "=== Algoritmo de Selección mediante trazas ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(trazas, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                SelectionSort.ordenar(copia, true, trazas); // con trazas
                imprimir(trazas, "Resultado final: " + Arrays.toString(copia));
                imprimir(trazas, "");
            }

            imprimir(salida, "=== Ordenamiento usando el algoritmo Burbuja ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(salida, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                BubbleSort.ordenar(copia); // sin trazas
                imprimir(salida, "Resultado final: " + Arrays.toString(copia));
                imprimir(salida, "");
            }

            imprimir(trazas, "=== Algoritmo Burbuja mediante trazas ===");
            for (int i = 0; i < conjuntosDeDatos.length; i++) {
                int[] copia = SortingUtils.clonarArreglo(conjuntosDeDatos[i]);
                imprimir(trazas, "Conjunto " + nombres[i] + ": original = " + Arrays.toString(copia));
                BubbleSort.ordenar(copia, true, trazas); // con trazas
                imprimir(trazas, "Resultado final: " + Arrays.toString(copia));
                imprimir(trazas, "");
            }

            System.out.println("Resultados guardados en 'resultados.txt' y trazas en 'resultadosTrazas.txt'");

        } catch (IOException e) {
            System.out.println("Error al escribir los archivos: " + e.getMessage());
        }
    }

    private static void imprimir(PrintWriter salida, String mensaje) {
        System.out.println(mensaje);
        salida.println(mensaje);
    }
}