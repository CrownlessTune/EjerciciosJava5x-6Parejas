package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce la posición del dígito que deseas obtener (empezando desde 0): ");
        int n = scanner.nextInt();

        int digito = obtenerDigitoEnPosicion(numero, n);
        if (digito != -1) {
            System.out.println("El dígito en la posición " + n + " de " + numero + " es: " + digito);
        } else {
            System.out.println("Posición fuera de rango.");
        }

        scanner.close();
    }

    public static int obtenerDigitoEnPosicion(int numero, int n) {
        String numeroStr = String.valueOf(Math.abs(numero)); // Convierte a String y maneja negativos
        if (n < 0 || n >= numeroStr.length()) {
            return -1; // Indica que la posición está fuera de rango
        }
        return Character.getNumericValue(numeroStr.charAt(n)); // Obtiene el dígito en la posición n
    }
}
