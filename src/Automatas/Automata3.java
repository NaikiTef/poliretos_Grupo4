package Automatas;

import java.util.Scanner;

public class Automata3 {

    public void automata3(Scanner sc) {

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        int estado = 0;
        boolean valido = true;
        int contador = 0;

        System.out.println("A03 con for");
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (estado == 0) {
                if (c == 'a')
                    continue;
                else if (c == 'b')
                    estado = 1;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 1) {
                if (c == 'b')
                    continue;
                else if (c == 'c')
                    estado = 2;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 2) {
                if (c != 'c') {
                    valido = false;
                    break;
                }
            }
        }
        if (valido && cadena.matches("a+b+c+"))
            System.out.println("Cadena válida ");
        else
            System.out.println("Cadena inválida");

        System.out.println("A03 con while");
        while (contador < cadena.length()) {
            char c = cadena.charAt(contador);

            if (estado == 0) {
                if (c == 'a') {
                } else if (c == 'b')
                    estado = 1;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 1) {
                if (c == 'b') {
                } else if (c == 'c')
                    estado = 2;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 2) {
                if (c != 'c') {
                    valido = false;
                    break;
                }
            }
            contador++;
        }

        if (valido && cadena.matches("a+b+c+"))
            System.out.println("Cadena válida");
        else
            System.out.println("Cadena inválida");

        System.out.println("A03 con do while");
        do {
            char c = cadena.charAt(contador);

            if (estado == 0) {
                if (c == 'a') {
                } else if (c == 'b')
                    estado = 1;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 1) {
                if (c == 'b') {
                } else if (c == 'c')
                    estado = 2;
                else {
                    valido = false;
                    break;
                }
            } else if (estado == 2) {
                if (c != 'c') {
                    valido = false;
                    break;
                }
            }

            contador++;
        } while (contador < cadena.length());

        if (valido && cadena.matches("a+b+c+"))
            System.out.println("Cadena válida");
        else
            System.out.println("Cadena inválida");

    }

}
