package edu.unl.cc.ed.u2.sorting;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * En esta clase implementamos el algoritmo de ordenacion por insercion
 * Recorre todo el arreglo y lo va intertando en la posicion correcta
 * @author Steeven Pardo, Darwin Correa
 */
public final class InsertionSort {
    /**
     * Aqui va a ordenar el arreglo de forma ascedente
     * @param arreglo
     */
    public static void ordenar(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            int posicion = i - 1;

            while (posicion >= 0 && arreglo[posicion] > valorActual) {
                arreglo[posicion + 1] = arreglo[posicion];
                posicion--;
            }
            arreglo[posicion + 1] = valorActual;
        }
    }

    /**
     * Ordena el arreglo y muestra las trazas si es que ativamos la opcion
     * @param arreglo
     * @param traza
     * @param escritor
     */
    public static void ordenar(int[] arreglo, boolean traza, PrintWriter escritor) {
        int movimientos = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            int posicion = i - 1;

            while (posicion >= 0 && arreglo[posicion] > valorActual) {
                arreglo[posicion + 1] = arreglo[posicion];
                posicion--;
                movimientos++;
            }
            arreglo[posicion + 1] = valorActual;

            if (traza) {
                System.out.print("Iteración " + i + ": ");
                SortingUtils.imprimirArreglo(arreglo);
                if (escritor != null) {
                    escritor.println("Iteración " + i + ": " + Arrays.toString(arreglo));
                }
            }
        }

        if (traza && escritor != null) {
            escritor.println("Total de movimientos: " + movimientos);
        }
    }
}