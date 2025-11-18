package edu.unl.cc.ed.u2.sorting;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * En esta clase implementamos el algoritmo de ordenacion por seleccion
 * Se encarga de buscar el elemento minimo durante cada pasada para colocarlo en la posicion correcta
 * @author Steeven Pardo, Darwin Correa
 */
public final class SelectionSort {
    /**
     * Se encarga de ordenar el arreglo de forma ascendente
     * @param arreglo
     */
    public static void ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temporal = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = temporal;
        }
    }

    /**
     * Ordena el arreglo y muestra las trazas si es que ativamos la opcion
     * @param arreglo
     * @param traza
     * @param escritor
     */
    public static void ordenar(int[] arreglo, boolean traza, PrintWriter escritor) {
        int intercambios = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                int temporal = arreglo[i];
                arreglo[i] = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = temporal;
                intercambios++;
            }
            if (traza) {
                System.out.print("Iteración " + i + ": ");
                SortingUtils.imprimirArreglo(arreglo);
                if (escritor != null) {
                    escritor.println("Iteración " + i + ": " + Arrays.toString(arreglo));
                }
            }
        }
        if (traza) {
            System.out.println("Total de intercambios: " + intercambios);
            if (escritor != null) {
                escritor.println("Total de intercambios: " + intercambios);
            }
        }
    }
}