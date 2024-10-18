package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int siguientePrimo = siguientePrimo(numero);
        System.out.println("El siguiente número primo mayor que " + numero + " es: " + siguientePrimo);

        scanner.close();
    }

    public static int siguientePrimo(int numero) {
        numero++;
        while (!esPrimo(numero)) {
            numero++;
        }
        return numero;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
