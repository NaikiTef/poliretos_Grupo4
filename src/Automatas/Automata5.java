package Automatas;

import java.util.Scanner;

public class Automata5 {

    public void automata5(Scanner scanner){    
        
        System.out.println("Ingrese el nombre de la variable a validar:");
        
        String variable = scanner.nextLine();

        if (esValida(variable)) {
            System.out.println("La variable \"" + variable + "\" es válida en Java.");
        } else {
            System.out.println("La variable \"" + variable + "\" NO es válida en Java.");
        }
    }

    public boolean esValida(String var) {
        if (var == null || var.isEmpty())
            return false;

        char primero = var.charAt(0);

        if (!esLetra(primero) && primero != '_' && primero != '$')
            return false;
            
            for (int i = 1; i < var.length(); i++) {
            char c = var.charAt(i);
            if (!esLetra(c) && !esNumero(c) && c != '_' && c != '$')
                return false;
        }

        return true;
    }

    public boolean esLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public boolean esNumero(char c) {
        return (c >= '0' && c <= '9');
    }
}
