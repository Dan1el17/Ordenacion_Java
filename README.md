# Ordenacion_Java: Burbuja, Selección e Inserción

##  Objetivo

Implementar y comparar tres algoritmos de ordenación **in-place** sobre arreglos pequeños, validando su funcionamiento con trazas y casos de prueba reproducibles.

---

## Estructura del proyecto

El proyecto está organizado en el paquete `ed.u2.sorting`, con las siguientes clases:

- `InsertionSort`: ordenación por inserción
- `SelectionSort`: ordenación por selección
- `BubbleSort`: ordenación por burbuja con corte temprano
- `SortingDemo`: clase principal para ejecutar pruebas
- `SortingUtils`: utilidad auxiliar 

#  Taller 5 – Algoritmos de Ordenamiento

Este proyecto implementa tres algoritmos clásicos de ordenamiento en Java: **inserción**, **selección** y **burbuja**, aplicados sobre arreglos de enteros. Se incluye trazado opcional y generación de resultados en consola y archivo `.txt`.

---

##  Decisiones de implementación

- Se usó **sobrecarga de métodos** (`ordenar(...)`) para permitir trazas sin duplicar nombres.
- Se creó una clase auxiliar `SortingUtils` para evitar repetir código (imprimir, clonar, comparar).
- Los algoritmos están separados en clases individuales para facilitar pruebas y claridad.
- Se implementó una clase principal `SortingDemo` que ejecuta todos los algoritmos sobre varios conjuntos de datos.
- Se genera un archivo `resultados.txt` con los resultados finales, además de mostrarlos en consola.
- Tambien se genera un archivo `resultadosTrazas.txt` con los resultados finales y las trazas que se realizaron, además de mostrarlos en consola.

---

##  Casos borde probados

- Arreglo desordenado con duplicados: {8, 3, 6, 3, 9}
- Arreglo en orden inverso: {5, 4, 3, 2, 1}
- Arreglo ya ordenado: {1, 2, 3, 4, 5}
- Todos los elementos iguales: {2, 2, 2, 2}
- Mezcla de valores altos y bajos: {9, 1, 8, 2}
- Números negativos y positivos: {-3, -1, 0, 2}
- Mezcla extensa con negativos y positivos: {5, 9, -4, 0, -1, 1, -2}
- Un solo elemento: {1}
- Arreglo vacío: {}
---

Cada clase implementa el método:

```java
public static void ordenar(int[] arreglo)
```
Ordena el arreglo sin mostrar trazas.
```
public static void ordenar(int[] arreglo, boolean traza)
```
Ordena el arreglo y muestra el estado paso a paso si traza es true.

## Cómo ejecutar el proyecto

1. Descarga el zip del proyecto
2. Abre el proyecto en tu entorno Java (VS Code, IntelliJ, etc.).
3. Compila todas las clases dentro del paquete `ed.u2.sorting`.
4. Ejecuta la clase `SortingDemo`.
5. Verás los resultados en consola y se generará el archivo `resultados.txt` dentro de la raíz del proyecto.

---
##  Autores
### [Steeven Pardo](https://github.com/Dan1el17)
### [Darwin Correa](https://github.com/Darwin090)

