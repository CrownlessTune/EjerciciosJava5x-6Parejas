package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce la posición inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Introduce la posición final: ");
        int fin = scanner.nextInt();

        String trozo = trozoDeNumero(numero, inicio, fin);
        System.out.println("El trozo del número es: " + trozo);

        scanner.close();
    }

    public static String trozoDeNumero(int numero, int inicio, int fin) {
        String numeroStr = String.valueOf(numero);
        if (inicio < 0 || fin >= numeroStr.length() || inicio > fin) {
            return "Posiciones no válidas.";
        }
        return numeroStr.substring(inicio, fin + 1); // Extrae el trozo del número
    }
}
