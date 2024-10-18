package Ejercicios5_1;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];

        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número para posición [" + i + "][" + j + "]: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        String resultado = mostrarSuma(numeros);
        System.out.println(resultado);

        scanner.close();
    }

    public static String mostrarSuma(int[][] numeros) {
        StringBuilder resultado = new StringBuilder();
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                resultado.append(String.format("%5d", numeros[i][j]));
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
            resultado.append(String.format(" | %5d\n", sumaFilas[i]));
        }

        for (int j = 0; j < 5; j++) {
            resultado.append(String.format("%5d", sumaColumnas[j]));
        }
        resultado.append(String.format(" | %5d\n", sumaTotal));

        return resultado.toString();
    }
}

