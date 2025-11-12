package Cadena_caracteres;

import java.util.Scanner;

public class CadenaDeCaracter8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String s = scanner.nextLine();
        
        CadenaDeCaracter8 cdc8 = new CadenaDeCaracter8();
        cdc8.imprimirCadenaDeCaracter8(s);
        
        scanner.close();
    }
    
    public void imprimirCadenaDeCaracter8(String s) {
        System.out.println("\nCadena De Caracter 8:");
        System.out.println("Cadena Original: " + s);
        
        System.out.println("\nFOR:");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        
        System.out.println("\n\nWHILE:");
        int i = 0;
        while (i < chars.length) {
            System.out.print(chars[i] + " ");
            i++;
        }
        
        System.out.println("\n\nDO-WHILE:");
        i = 0;
        do {
            System.out.print(chars[i] + " ");
            i++;
        } while (i < chars.length);
        
        System.out.println("\n");
    }
}