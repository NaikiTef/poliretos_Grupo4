package Cadena_caracteres;

import java.util.Scanner;

public class CadenaCaracter9 {

    public static void CadenaCaracterFor(Scanner scanner){
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += Character.toLowerCase(letra);
            }
        }
        System.out.println("Salida: " + resultado);
        System.out.print("\n================================================================\n");
    }
    

    public static void CadenaCaracterWhile(Scanner scanner){
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String resultado = "";

        int i = 0;
        while (i < frase.length()) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += Character.toLowerCase(letra);
            }
            i++;
        }
        System.out.println("Salida: " + resultado);
        System.out.print("\n================================================================\n");

    }

    public static void CadenaCaracterDoWhile(Scanner scanner){
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String resultado = "";
        
        int i = 0;
        if (frase.length() > 0) {
            do {
                char letra = frase.charAt(i);
                if (i % 2 == 0) {
                    resultado += Character.toUpperCase(letra);
                } else {
                    resultado += Character.toLowerCase(letra);
                }
                i++;
            } while (i < frase.length());
        }

        System.out.println("Salida: " + resultado);
        System.out.print("\n================================================================\n");
    }
}
