package Figuras;

import java.util.Scanner;

public class Figura8 {

    public void figura8(Scanner scanner) {
        Integer tamanio = 0;
        boolean valido = false;
        
        // Validar entrada
        while (!valido) {
            try {
                System.out.print("Ingrese el tamanio de la figura: ");
                tamanio = Integer.parseInt(scanner.nextLine().trim());
                if (tamanio > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: El tamaño debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }

        Integer copiaTamanio = tamanio;
        Integer contador = 1;
        char elementos[] = { '_', '|' };

        System.out.println("F8 con for");
        for (int i = 1; i <= copiaTamanio; copiaTamanio--) {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio) + elementos[0]);
            System.out.println(elementos[1]);
        }
        contador = 1;
        copiaTamanio = tamanio;

        System.out.println("F8 con while");
        while (contador <= copiaTamanio) {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio--) + elementos[0]);
            System.out.println(elementos[1]);
        }
        contador = 1;
        copiaTamanio = tamanio;

        System.out.println("F8 con do while");
        do {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio--) + elementos[0]);
            System.out.println(elementos[1]);
        } while (contador <= copiaTamanio);
        contador = 1;
        copiaTamanio = tamanio;
        
        scanner.close();
    }
}
