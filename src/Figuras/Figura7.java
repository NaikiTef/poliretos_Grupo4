package Figuras;

import java.util.Scanner;

public class Figura7 {

    public void figura7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamanio de la figura: ");
        Integer tamanio = scanner.nextInt();

        Integer contador = 1;
        char elementos[] = { '_', '|', };

        System.out.println("F7 con for");
        for (int i = 1; i <= tamanio; i++) {
            System.out.println(elementos[0]);
            System.out.print("  ".repeat(i) + elementos[1]);
            if (i == tamanio) {
                System.out.println(elementos[0]);
            }
        }

        System.out.println("F7 con while");
        while (contador <= tamanio) {
            System.out.println(elementos[0]);
            System.out.print("  ".repeat(contador) + elementos[1]);
            if (contador == tamanio) {
                System.out.println(elementos[0]);
            }
            contador++;
        }
        contador = 1;

        System.out.println("F7 con do while");
        do {
            System.out.println(elementos[0]);
            System.out.print("  ".repeat(contador) + elementos[1]);
            if (contador == tamanio) {
                System.out.println(elementos[0]);
            }
            contador++;
        } while (contador <= tamanio);
    }

}
