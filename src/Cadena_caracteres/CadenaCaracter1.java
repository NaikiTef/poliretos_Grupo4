package Cadena_caracteres;

import java.util.Scanner;

public class CadenaCaracter1 {
    
    public void cadenaCaracter1(Scanner scanner) {
        
        // Validar que solo se ingresen letras
        String cadena;
        do {
            System.out.print("Ingrese una cadena de caracteres (solo letras): ");
            cadena = scanner.nextLine();
            if (!esValidaCadena(cadena)) {
                System.out.println("Error: Solo se permiten letras. Intente nuevamente.");
            }
        } while (!esValidaCadena(cadena));

        int contadorFor = contarVocalesFor(cadena);
        System.out.println("Número total de vocales usando for: " + contadorFor);

        int contadorWhile = contarVocalesWhile(cadena);
        System.out.println("Número total de vocales usando while: " + contadorWhile);

        int contadorDoWhile = contarVocalesDoWhile(cadena);
        System.out.println("Número total de vocales usando do while: " + contadorDoWhile);
    }
    
    public static boolean esValidaCadena(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
    
    // Método para verificar si un carácter es vocal
    public static boolean esVocal(char c) {
        char vocal = Character.toLowerCase(c);
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';
    }
    
    // Contar vocales usando for
    public static int contarVocalesFor(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    // Contar vocales usando while
    public static int contarVocalesWhile(String cadena) {
        int contador = 0;
        int i = 0;
        while (i < cadena.length()) {
            if (esVocal(cadena.charAt(i))) {
                contador++;
            }
            i++;
        }
        return contador;
    }
    
    // Contar vocales usando do-while
    public static int contarVocalesDoWhile(String cadena) {
        int contador = 0;
        int i = 0;
        if (cadena.length() > 0) {
            do {
                if (esVocal(cadena.charAt(i))) {
                    contador++;
                }
                i++;
            } while (i < cadena.length());
        }
        return contador;
    }
}
