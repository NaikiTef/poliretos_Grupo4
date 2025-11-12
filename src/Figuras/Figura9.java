package Figuras;

import java.util.Scanner;

public class Figura9 {

    public void figura9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamanio de la figura: ");
        Integer tamanio = scanner.nextInt();

        Integer copiaTamanio = tamanio;
        Integer contador = 1;
        char elementos[] = { '_', '|', };

        System.out.println("F9 con for");
        for (int i = 1; i <= copiaTamanio; copiaTamanio--) {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0] + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio) + elementos[0] + elementos[1] + "  ".repeat(contador - 1));
            System.out.println("  ".repeat(contador) + elementos[1] + elementos[0]);
            contador++;
        }
        contador = 1;
        copiaTamanio = tamanio;

        System.out.println("F9 con while");
        while (contador <= tamanio) {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0] + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio) + elementos[0] + elementos[1] + "  ".repeat(contador - 1));
            System.out.println("  ".repeat(contador) + elementos[1] + elementos[0]);
            contador++;
            copiaTamanio--;
        }
        contador = 1;
        copiaTamanio = tamanio;

        System.out.println("F9 con do while");
        do {
            if (copiaTamanio == tamanio) {
                System.out.println("  ".repeat(copiaTamanio + 1) + elementos[0] + elementos[0]);
            }
            System.out.print("  ".repeat(copiaTamanio) + elementos[0] + elementos[1] + "  ".repeat(contador - 1));
            System.out.println("  ".repeat(contador) + elementos[1] + elementos[0]);
            contador++;
            copiaTamanio--;
        } while (contador <= tamanio);
        contador = 1;
        copiaTamanio = tamanio;
    }

}
