package Recursion;

import java.util.Scanner;

public class Recursion2 {
    
    public void recursion2(Scanner scanner) {
        int a = 0, b = 0;
        boolean entradaValida;

        // Validación para 'a'
        do {
            entradaValida = true;
            System.out.println("Ingrese el primer número (a):");
            try {
                a = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                entradaValida = false;
            }
        } while (!entradaValida);

        // Validación para 'b'
        do {
            entradaValida = true;
            System.out.println("Ingrese el segundo número (b):");
            try {
                b = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                entradaValida = false;
            }
        } while (!entradaValida);

        System.out.println("La suma recursiva de " + a + " + " + b + " es: " + suma(a, b));
        // No cerrar el scanner
    }

    public static int suma(int a, int b) {
        if (b == 0) {
            return a; // Caso base
        } else if (b > 0) {
            return suma(a + 1, b - 1); // Si b es positivo, incrementa a y reduce b
        } else {
            return suma(a - 1, b + 1); // Si b es negativo, decrementa a y aumenta b
        }
    }

}
