package Cadena_carateres;

import java.util.Scanner;

public class CadenaCaracter5 {

    public void cadenaCaracter6() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        Character letra;
        Character letraConvertida;
        Integer contador = 1;
        Integer tamanio = palabra.length();

        System.out.println("C06 con for");
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = letra;
            } else
                letraConvertida = Character.toUpperCase(letra);

            System.out.print(letraConvertida);
            tamanio--;
        }
        tamanio = palabra.length();

        System.out.println("\nC06 con while");
        while (contador <= palabra.length()) {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = letra;
            } else
                letraConvertida = Character.toUpperCase(letra);

            System.out.print(letraConvertida);
            tamanio--;
            contador++;
        }
        contador = 1;
        tamanio = palabra.length();

        System.out.println("\nC06 con do while");
        do {
            letra = palabra.charAt(tamanio - 1);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
                letraConvertida = letra;
            } else
                letraConvertida = Character.toUpperCase(letra);

            System.out.print(letraConvertida);
            tamanio--;
            contador++;
        } while (contador <= palabra.length());
        contador = 1;
        tamanio = palabra.length();
        scanner.close();
    }

}
