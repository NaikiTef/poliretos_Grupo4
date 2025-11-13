package Cadena_caracteres;

import java.util.Scanner;

public class CadenaCaracter4 {
    
    public void cadenaCaracter4(Scanner scanner) {

        // Validar que solo se ingresen letras y espacios
        String frase;
        do {
            System.out.print("Ingrese una frase (solo letras y espacios): ");
            frase = scanner.nextLine();
            if (!esValidaCadena(frase)) {
                System.out.println("Error: Solo se permiten letras y espacios. Intente nuevamente.");
            }
        } while (!esValidaCadena(frase));

        // Pedir una letra válida (una sola consonante)
        String letra;
        do {
            System.out.print("Ingrese una letra (no puede ser vocal): ");
            letra = scanner.nextLine().toLowerCase();

            if (!esLetraValida(letra)) {
                System.out.println("Error: Debe ingresar una sola letra válida. Intente nuevamente.");
            } else if (esVocal(letra.charAt(0))) {
                System.out.println("Error: No se permiten vocales. Ingrese una consonante.");
                letra = ""; // Fuerza repetir el ciclo
            }

        } while (!esLetraValida(letra) || esVocal(letra.charAt(0)));

        // Eliminar la letra de la frase usando los tres métodos
        System.out.println("\n=== Usando FOR ===");
        String resultadoFor = eliminarLetra(frase, letra.charAt(0));
        System.out.println("Frase original: " + frase);
        System.out.println("Letra eliminada: " + letra);
        System.out.println("Frase resultante: " + resultadoFor);

        System.out.println("\n=== Usando WHILE ===");
        String resultadoWhile = eliminarLetraWhile(frase, letra.charAt(0));
        System.out.println("Frase original: " + frase);
        System.out.println("Letra eliminada: " + letra);
        System.out.println("Frase resultante: " + resultadoWhile);

        System.out.println("\n=== Usando DO-WHILE ===");
        String resultadoDoWhile = eliminarLetraDoWhile(frase, letra.charAt(0));
        System.out.println("Frase original: " + frase);
        System.out.println("Letra eliminada: " + letra);
        System.out.println("Frase resultante: " + resultadoDoWhile);
    }

    // Validar que solo se ingresen letras y espacios
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

    // Validar que la entrada sea una sola letra
    public static boolean esLetraValida(String s) {
        if (s == null || s.length() != 1) {
            return false;
        }
        char c = s.charAt(0);
        return Character.isLetter(c);
    }

    // Método para verificar si un carácter es vocal
    public static boolean esVocal(char c) {
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    // Método para eliminar una letra de la frase
    public static String eliminarLetra(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            } else {
                resultado.append(" "); // deja un espacio donde estaba la letra eliminada
            }
        }
        return resultado.toString();
    }

    // Método para eliminar una letra de la frase usando while
    public static String eliminarLetraWhile(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            } else {
                resultado.append(" "); // deja un espacio donde estaba la letra eliminada
            }
            i++;
        }
        return resultado.toString();
    }

    // Método para eliminar una letra de la frase usando do-while
    public static String eliminarLetraDoWhile(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        if (frase.length() > 0) {
            int i = 0;
            do {
                char c = frase.charAt(i);
                if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                    resultado.append(c);
                } else {
                    resultado.append(" "); // deja un espacio donde estaba la letra eliminada
                }
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }
}
