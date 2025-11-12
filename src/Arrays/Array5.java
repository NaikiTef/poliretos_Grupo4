package Arrays;

import java.util.Scanner;

public class Array5 {

    public void array3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String n = scanner.nextLine();

        String nombre = n.trim();
        Character letra;
        Integer contador = 1;
        Integer tamanioNombre = nombre.length();

        System.out.println("A03 con for");
        for (int i = 1; i <= nombre.length(); i++) {
            letra = nombre.charAt(tamanioNombre - 1);
            System.out.println(tamanioNombre + "|" + " ".repeat(tamanioNombre * 2) + letra);
            tamanioNombre--;
        }
        tamanioNombre = nombre.length();

        System.out.println("A03 con while");
        while (contador <= tamanioNombre) {
            letra = nombre.charAt(tamanioNombre - 1);
            System.out.println(tamanioNombre + "|" + " ".repeat(tamanioNombre * 2) + letra);
            tamanioNombre--;
        }
        tamanioNombre = nombre.length();

        System.out.println("A03 con do while");
        do {
            letra = nombre.charAt(tamanioNombre - 1);
            System.out.println(tamanioNombre + "|" + " ".repeat(tamanioNombre * 2) + letra);
            tamanioNombre--;
        } while (contador <= tamanioNombre);
        tamanioNombre = nombre.length();
        scanner.close();
    }

}
