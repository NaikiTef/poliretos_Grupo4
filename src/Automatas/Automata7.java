package Automatas;

import java.util.Scanner;

public class Automata7 {
    
    public void automata7(Scanner sc) {
        System.out.print("Ingrese una clave: ");
        String clave = sc.nextLine();

        boolean mayus = false;
        boolean minus = false;
        boolean numero = false;
        boolean especial = false;

        int i = 0;
        do {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c))
                mayus = true;
            else if (Character.isLowerCase(c))
                minus = true;
            else if (Character.isDigit(c))
                numero = true;
            else
                especial = true;
            i++;
        } while (i < clave.length());

        if (mayus && minus && numero && especial)
            System.out.println("✅ Clave válida");
        else {
            System.out.println("❌ Clave inválida");
            System.out.println("Debe contener al menos:");
            if (!mayus) System.out.println(" - Una letra mayúscula");
            if (!minus) System.out.println(" - Una letra minúscula");
            if (!numero) System.out.println(" - Un número");
            if (!especial) System.out.println(" - Un carácter especial");
        }
    }
}
