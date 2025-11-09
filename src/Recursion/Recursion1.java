package Recursion;

import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        
        // Validación para n: solo números mayores o iguales a 0
        do {
            System.out.println("Ingrese un número para calcular su factorial (mayor o igual a 0):");
            try {
                n = Integer.parseInt(scanner.nextLine().trim());
                if (n < 0) {
                    System.out.println("Error: El número debe ser mayor o igual a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números enteros.");
                n = -1; // Valor inválido para mantener el bucle activo
            }
        } while (n < 0);
        
        System.out.println("Factorial de " + n + " es: " + factorial(n));
        scanner.close();

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }

}
