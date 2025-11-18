package edu.unl.cc.ed.u2.sorting;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * En esta clase implementamos el algoritmo de ordenacion burbuja
 * Este compara pares de elementos y los va intercambiando no estan en el orden correcto
 * @author Steeven Pardo, Darwin Correa
 */
public final class BubbleSort {
    /**
     * Se encarga de ordenar el arreglo de forma ascendente
     * @param arreglo
     */
    public static void ordenar(int[] arreglo) {
        boolean huboIntercambio;
        for (int i = 0; i < arreglo.length - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    huboIntercambio = true;
                }
            }
            if (!huboIntercambio) {
                break;
            }
        }
    }

    /**
     * Ordena el arreglo y muestra las trazas si es que ativamos la opcion
     * @param arreglo
     * @param traza
     * @param escritor
     */
    public static void ordenar(int[] arreglo, boolean traza, PrintWriter escritor) {
        boolean huboIntercambio;
        int totalSwaps = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    huboIntercambio = true;
                    totalSwaps++;
                }
            }
            if (traza) {
                System.out.print("Iteración " + i + ": ");
                SortingUtils.imprimirArreglo(arreglo);
                if (escritor != null) {
                    escritor.println("Iteración " + i + ": " + Arrays.toString(arreglo));
                }
            }
            if (!huboIntercambio) {
                if (traza) {
                    System.out.println("→ Corte en la iteración " + i);
                    if (escritor != null) {
                        escritor.println("→ Corte en la iteración " + i);
                    }
                }
                break;
            }
        }
        if (traza && escritor != null) {
            escritor.println("Total de intercambios: " + totalSwaps);
        }
    }
}