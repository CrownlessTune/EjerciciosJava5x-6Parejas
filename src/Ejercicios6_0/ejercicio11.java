package Ejercicios6_0;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("¿Qué dígito quieres añadir por detrás? ");
        int digito = scanner.nextInt();

        int resultado = pegaPorDetras(numero, digito);
        System.out.println("El número después de añadir el dígito es: " + resultado);

        scanner.close();
    }

    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito; // Añade el dígito al final del número
    }
}
