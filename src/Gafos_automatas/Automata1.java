package Gafos_automatas;

import java.util.Scanner;

public class Automata1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Prueba Manual ===");
        
        // Permitir al usuario probar sus propias cadenas
        String entrada;
        do {
            System.out.print("Ingrese una cadena para probar (solo letras a, b, c) o 'salir' para terminar: ");
            entrada = scanner.nextLine().trim();
            
            if (!entrada.equalsIgnoreCase("salir")) {
                if (esValidaCadena(entrada)) {
                    boolean resultado = automata1(entrada);
                    System.out.println("La cadena \"" + entrada + "\" es " + (resultado ? "aceptada" : "rechazada") + " por el autómata.");
                } else {
                    System.out.println("Error: La cadena solo puede contener las letras 'a', 'b' y 'c'.");
                }
            }
        } while (!entrada.equalsIgnoreCase("salir"));
        
        scanner.close();
    }
    
    // Método para validar que la cadena solo contenga a, b, c
    public static boolean esValidaCadena(String cadena) {
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

    public static boolean automata1(String cadena) {
        int estadoActual = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            switch (estadoActual) {
                case 0:
                    if (simbolo == 'a') {
                        estadoActual = 0;
                    } else if (simbolo == 'b') {
                        estadoActual = 1;
                    } else {
                        return false;
                    }
                    break;

                case 1:
                    if (simbolo == 'b') {
                        estadoActual = 1;
                    } else if (simbolo == 'c') {
                        estadoActual = 2;
                    } else {
                        return false;
                    }
                break;
                case 2:
                    return false;
                default:
                    return false;
            }
        }
        return estadoActual == 2;
    }
}
