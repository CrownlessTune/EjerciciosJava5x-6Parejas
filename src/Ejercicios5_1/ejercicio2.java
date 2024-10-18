package Ejercicios5_1;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;

        // Pedir los 20 números enteros
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número para posición [" + i + "][" + j + "]: ");
                numeros[i][j] = scanner.nextInt();
                sumaFilas[i] += numeros[i][j];  // Sumar filas
                sumaColumnas[j] += numeros[i][j];  // Sumar columnas
                sumaTotal += numeros[i][j];  // Sumar total
            }
        }

        // Mostrar la tabla con sumas parciales
        System.out.println("\nTabla con sumas parciales:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.printf(" | %5d\n", sumaFilas[i]);  // Mostrar suma de la fila actual
        }

        // Mostrar las sumas de las columnas
        for (int j = 0; j < 5; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }
        System.out.printf(" | %5d\n", sumaTotal);  // Mostrar la suma total en la esquina inferior derecha

        scanner.close();
    }
}
