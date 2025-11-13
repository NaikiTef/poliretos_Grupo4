package Loading;

import java.util.Scanner;

public class L08 {

    public void loading8(Scanner scanner) {
        System.out.print("Ingrese un nombre: ");
        String n = scanner.nextLine();
        String nombre = n.trim();

        String pedazoNombre;
        Integer espacios = nombre.length() - 1;
        Float porcentaje = 0.0f;
        Float aumento = (100.0f / nombre.length());
        Integer contador = 0;

        System.out.println("L08 con for");
        try {
            for (int i = 0; i < nombre.length(); i++) {
                pedazoNombre = nombre.substring(0, i + 1);
                System.out.print("\r[" + pedazoNombre + " ".repeat(espacios--) + "]");
                System.out.print(Math.round(porcentaje += aumento) + "%");
                Thread.sleep(333);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = nombre.length() - 1;
        porcentaje = 0.0f;

        System.out.println("\nL08 con while");
        try {
            while (contador < nombre.length()) {
                pedazoNombre = nombre.substring(0, contador + 1);
                System.out.print("\r[" + pedazoNombre + " ".repeat(espacios--) + "]");
                System.out.print(Math.round(porcentaje += aumento) + "%");
                contador++;
                Thread.sleep(333);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = nombre.length() - 1;
        porcentaje = 0.0f;
        contador = 0;

        System.out.println("\nL08 con  do while");
        try {
            do {
                pedazoNombre = nombre.substring(0, contador + 1);
                System.out.print("\r[" + pedazoNombre + " ".repeat(espacios--) + "]");
                System.out.print(Math.round(porcentaje += aumento) + "%");
                contador++;
                Thread.sleep(400);
            } while (contador < nombre.length());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = nombre.length() - 1;
        porcentaje = 0.0f;
        contador = 0;
        // No cerrar el scanner
    }

}
