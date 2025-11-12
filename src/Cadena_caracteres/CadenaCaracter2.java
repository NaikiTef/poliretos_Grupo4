package Cadena_caracteres;

import java.util.Scanner;

public class CadenaCaracter2 {
    
    public void cadenaCaracter2(Scanner scanner) {
        
        // Validar que solo se ingresen letras
        String cadena;
        do {
            System.out.print("Ingrese una cadena de caracteres (solo letras): ");
            cadena = scanner.nextLine();
            if (!esValidaCadena(cadena)) {
                System.out.println("Error: Solo se permiten letras. Intente nuevamente.");
            }
        } while (!esValidaCadena(cadena));

        int contadorFor = contarConsonantesFor(cadena);
        System.out.println("Número total de consonantes usando for: " + contadorFor);

        int contadorWhile = contarConsonantesWhile(cadena);
        System.out.println("Número total de consonantes usando while: " + contadorWhile);

        int contadorDoWhile = contarConsonantesDoWhile(cadena);
        System.out.println("Número total de consonantes usando do while: " + contadorDoWhile);
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
    
    // Contar consonantes usando for (letras que NO son vocales)
    public static int contarConsonantesFor(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c) && !esVocal(c)) {
                contador++;
            }
        }
        return contador;
    }
    
    // Contar letras usando while (excluyendo espacios)
    // Contar consonantes usando while
    public static int contarConsonantesWhile(String cadena) {
        int contador = 0;
        int i = 0;
        while (i < cadena.length()) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c) && !esVocal(c)) {
                contador++;
            }
            i++;
        }
        return contador;
    }
    
    // Contar letras usando do-while (excluyendo espacios)
    // Contar consonantes usando do-while
    public static int contarConsonantesDoWhile(String cadena) {
        int contador = 0;
        int i = 0;
        if (cadena.length() > 0) {
            do {
                char c = cadena.charAt(i);
                if (Character.isLetter(c) && !esVocal(c)) {
                    contador++;
                }
                i++;
            } while (i < cadena.length());
        }
        return contador;
    }
}
