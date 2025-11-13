package Automatas;

import java.util.Scanner;

public class Automata2 {
     
    public void automata2(Scanner scanner) {
        System.out.println("\n=== Prueba Manual ===");
        
        // Permitir al usuario probar sus propias cadenas
        String entrada;
        do {
            System.out.print("Ingrese una cadena para probar (solo letras a, b, c) o 'salir' para terminar: ");
            entrada = scanner.nextLine().trim();
            
            if (!entrada.equalsIgnoreCase("salir")) {
                if (esValidaCadena(entrada)) {
                    System.out.println("\n--- Validación con FOR ---");
                    boolean forValido = automataFor(entrada);
                    System.out.println("Resultado: " + (forValido ? "Aceptada" : "Rechazada"));

                    System.out.println("\n--- Validación con WHILE ---");
                    boolean whileValido = automataWhile(entrada);
                    System.out.println("Resultado: " + (whileValido ? "Aceptada" : "Rechazada"));

                    System.out.println("\n--- Validación con DO-WHILE ---");
                    boolean doWhileValido = automataDoWhile(entrada);
                    System.out.println("Resultado: " + (doWhileValido ? "Aceptada" : "Rechazada"));
                    System.out.println();
                } else {
                    System.out.println("Error: La cadena solo puede contener las letras 'a', 'b' y 'c'.");
                }
            }
        } while (!entrada.equalsIgnoreCase("salir"));
    }
    
    // Método para validar que la cadena solo contenga a, b, c
    public boolean esValidaCadena(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c != 'a' && c != 'b' && c != 'c') {
                return false;
            }
        }
        return true;
    }

    // =====================================================
    // AUTOMATA CON FOR
    // =====================================================
    public boolean automataFor(String cadena) {
        if (cadena.length() < 4 || cadena.charAt(0) != 'a') return false;

        int i = 1;
        for (; i < cadena.length() && cadena.charAt(i) == 'b'; i++); // recorrer todas las 'b'

        if (i >= cadena.length() || cadena.charAt(i) != 'c') return false;
        i++;

        return (i == cadena.length() - 1 && cadena.charAt(i) == 'a');
    }

    // =====================================================
    // AUTOMATA CON WHILE
    // =====================================================
    public boolean automataWhile(String cadena) {
        if (cadena.length() < 4 || cadena.charAt(0) != 'a') return false;

        int i = 1;
        while (i < cadena.length() && cadena.charAt(i) == 'b') {
            i++;
        }

        if (i >= cadena.length() || cadena.charAt(i) != 'c') return false;
        i++;

        return (i == cadena.length() - 1 && cadena.charAt(i) == 'a');
    }

    // =====================================================
    // AUTOMATA CON DO-WHILE
    // =====================================================
    public boolean automataDoWhile(String cadena) {
        if (cadena.length() < 4 || cadena.charAt(0) != 'a') return false;

        int i = 1;
        boolean tieneB = false;

        do {
            if (i >= cadena.length()) return false;
            if (cadena.charAt(i) == 'b') {
                tieneB = true;
                i++;
            } else {
                break;
            }
        } while (i < cadena.length());

        if (!tieneB) return false;
        if (i >= cadena.length() || cadena.charAt(i) != 'c') return false;
        i++;

        return (i == cadena.length() - 1 && cadena.charAt(i) == 'a');
    }
}
