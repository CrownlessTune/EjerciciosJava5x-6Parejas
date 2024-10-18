package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("¿Cuántos dígitos quieres quitar por detrás? ");
        int n = scanner.nextInt();

        int resultado = quitarPorDetras(numero, n);
        System.out.println("El número después de quitar " + n + " dígitos es: " + resultado);

        scanner.close();
    }

    public static int quitarPorDetras(int numero, int n) {
        return (int) (numero / Math.pow(10, n)); // Quita n dígitos al dividir por 10^n
    }
}
