package Automatas;

import java.util.Scanner;

public class Automata6 {

    public void automata6(Scanner scanner) {
        System.out.print("Ingrese una cadena para validar: ");
        String s = scanner.nextLine();

        if (validar(s)) {
            System.out.println("CADENA ACEPTADA");
        } else {
            System.out.println("CADENA RECHAZADA");
        }
    }

    boolean validar(String s) {

        // eliminar espacios iniciales y finales
        s = s.trim();

        // Remover caracteres de aceptación: espacio y "("
        String limpio = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // se permiten " " y "(" después de la palabra
            if (c == ' ' || c == '(') continue;

            limpio += c;
        }

        // palabras válidas del lenguaje
        String[] tokens = {"for", "if", "else", "ifelse", "foreach"};

        for (String t : tokens) {
            if (limpio.equals(t)) {
                return true;
            }
        }

        return false;
    }
}