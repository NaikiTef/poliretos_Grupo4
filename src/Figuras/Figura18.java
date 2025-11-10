package Figuras;

import java.util.Scanner;

public class Figura18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int nivel = 0;
        do{
            System.out.print("Ingrese el número de niveles: ");
            try{
                nivel = Integer.parseInt(scanner.nextLine().trim());
                if(nivel <= 0){
                    System.out.println("Error: El número de niveles debe ser mayor a 0.");
                }
            }catch(NumberFormatException e){
                System.out.println("Error: Por favor ingrese solo números enteros.");
                nivel = 0; 
            }
        }while(nivel <= 0);
        
        scanner.close();

        System.out.println("Figura 18 usando for:");
        figura18For(nivel);
        System.out.println();
        
        System.out.println("Figura 18 usando while:");
        figura18While(nivel);
        System.out.println();
        
        System.out.println("Figura 18 usando do-while:");
        figura18DoWhile(nivel);
        System.out.println();
    }

    public static void figura18For(int nivel) {

        int[][] triangulo = new int[nivel + 1][nivel + 1]; // ← aquí va !

        for(int i = 0; i <= nivel; i++){

            if(i == 0){
                triangulo[i][0] = 2;
            }else{
                triangulo[i][0] = 1;
                triangulo[i][i] = 2;
            }

            // internos
            for(int k = 1; k <= i; k++){
                triangulo[i][k] = triangulo[i - 1][k - 1] + triangulo[i - 1][k];
            }

            // imprimir fila
            for(int j = 0; j <= i; j++){
                System.out.printf("%-4d", triangulo[i][j]);
            }
            System.out.println();
        }
    }

    public static void figura18While(int nivel) {
        int[][] triangulo = new int[nivel + 1][nivel + 1];

        int i = 0;
        while(i <= nivel){
            if(i == 0){
                triangulo[i][0] = 2;
            }else{
                triangulo[i][0] = 1;
                triangulo[i][i] = 2;
            }

            // internos
            int k = 1;
            while(k <= i){
                triangulo[i][k] = triangulo[i - 1][k - 1] + triangulo[i - 1][k];
                k++;
            }

            // imprimir fila
            int j = 0;
            while(j <= i){
                System.out.printf("%-4d", triangulo[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void figura18DoWhile(int nivel) {
        int[][] triangulo = new int[nivel + 1][nivel + 1];

        int i = 0;
        do{

            if(i == 0){
                triangulo[i][0] = 2;
            }else{
                triangulo[i][0] = 1;
                triangulo[i][i] = 2;
            }

            if(i > 0){
                int k = 1;
                do{
                    triangulo[i][k] = triangulo[i - 1][k - 1] + triangulo[i - 1][k];
                    k++;
                }while(k <= i);
            }

            int j = 0;
            do{
                System.out.printf("%-4d", triangulo[i][j]);
                j++;
            }while(j <= i);
            System.out.println();
            i++;
        }while(i <= nivel);
    }
}
