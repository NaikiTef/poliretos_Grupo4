package Cadena_caracteres;

import java.util.Scanner;

public class CadenaCaracter3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validar que solo se ingresen letras
        String frase;
        do {
            System.out.print("Ingrese una frase (solo letras y espacios): ");
            frase = scanner.nextLine();
            if (!esValidaCadena(frase)) {
                System.out.println("Error: Solo se permiten letras y espacios. Intente nuevamente.");
            }
        } while (!esValidaCadena(frase));

        // Pedir una vocal válida
        String vocal;
        do {
            System.out.print("Ingrese una vocal (a, e, i, o, u): ");
            vocal = scanner.nextLine().toLowerCase();
            if (!esVocalValida(vocal)) {
                System.out.println("Error: Debe ingresar una sola vocal válida. Intente nuevamente.");
            }
        } while (!esVocalValida(vocal));

        // Eliminar la vocal de la frase
        String resultado = eliminarVocal(frase, vocal.charAt(0));

        System.out.println("Frase original: " + frase);
        System.out.println("Vocal eliminada: " + vocal);
        System.out.println("Frase resultante: " + resultado);

        scanner.close();
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

    // Validar que la entrada sea una sola vocal
    public static boolean esVocalValida(String s) {
        if (s == null || s.length() != 1) {
            return false;
        }
        char c = Character.toLowerCase(s.charAt(0));
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Método para eliminar una vocal de la frase
    public static String eliminarVocal(String frase, char vocal) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
                resultado.append(c);
            } else {
                resultado.append(" "); // Deja espacio si quieres mantener la posición
            }
        }
        return resultado.toString();
    }
}
