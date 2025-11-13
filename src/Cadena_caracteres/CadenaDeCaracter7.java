package Cadena_caracteres;

import java.util.Scanner;

public class CadenaDeCaracter7 {
    
    // Eliminar main innecesario

    public void imprimirCadenaDeCaracter7(String s){
        System.out.println(" ");
        System.out.println("Cadena De Caracter Uno:");
        System.out.println("Cadena Original:"+s);
        System.out.println("For:");
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            char b = chars[i+1];
            char c = ' ';
            if (chars[i] == 'j'|| chars[i]== 'J') {
                c=b;
                chars[i]=b;
                for(int j=i+1;j<chars.length-i+1;j++){
                    chars[j]=chars[j+1];
                }
                // handle 'j' if needed
            }
        }
        System.out.println("Resultado:");
        System.out.println(new String(chars).toUpperCase());
        System.out.println(" ");


        System.out.println("Do:");
        int i=0;
        do{
            char b = chars[i+1];
            char c = ' ';
            if (chars[i] == 'j'|| chars[i]== 'J') {
                c=b;
                chars[i]=b;
                for(int j=i+1;j<chars.length-i+1;j++){
                    chars[j]=chars[j+1];
                }
                // handle 'j' if needed
            }
            i++;
        }while(i<chars.length-1);
        System.out.println("Resultado:");
        System.out.println(new String(chars).toUpperCase());
        System.out.println(" ");

        System.out.println("While:");
        i=0;
        while(i<chars.length-1){
            char b = chars[i+1];
            char c = ' ';
            if (chars[i] == 'j'|| chars[i]== 'J') {
                c=b;
                chars[i]=b;
                for(int j=i+1;j<chars.length-i+1;j++){
                    chars[j]=chars[j+1];
                }
                // handle 'j' if needed
               
    }
    i++;
     
    }
    System.out.println("Resultado:");
                System.out.println(new String(chars).toUpperCase());
                System.out.println(" ");
    }
}

