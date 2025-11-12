package Cadena_caracteres;

import java.util.Scanner;

public class C05 {

    public void cadenaCaracter5(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        Character letra;
        Character letraConvertida;
        Integer contador = 1;
        Integer tamanio = palabra.length();

        System.out.println("C05 con for");
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = Character.toUpperCase(letra);
            } else
                letraConvertida = letra;

            System.out.print(letraConvertida);
            tamanio--;
        }
        tamanio = palabra.length();

        System.out.println("\nC05 con while");
        while (contador < palabra.length()) {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = Character.toUpperCase(letra);
            } else
                letraConvertida = letra;

            System.out.print(letraConvertida);
            tamanio--;
            contador++;
        }
        contador = 1;
        tamanio = palabra.length();

        System.out.println("\nC05 con do while");
        do {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = Character.toUpperCase(letra);
            } else
                letraConvertida = letra;

            System.out.print(letraConvertida);
            tamanio--;
            contador++;
        } while (contador < palabra.length());
        contador = 1;
        tamanio = palabra.length();
    }

}


