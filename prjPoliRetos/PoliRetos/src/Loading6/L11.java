package Loading6;

import java.util.Random;
import java.util.Scanner;

public class L11 {

    public static void LoadingFor(Scanner scanner, Random random) throws InterruptedException{
         
        int[] alturas = new int[20];
        
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = random.nextInt(8); 
        }
        
        System.out.println("Alturas generadas:");
        
        for (int h : alturas) {
            System.out.print(h + " ");
        }
        System.out.println("\n");
        
        for (int fila = 8; fila > 0; fila--) {
            for (int i = 0; i < alturas.length; i++) {
                if (alturas[i] >= fila) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            Thread.sleep(500);  
        }

    }

    public static void LoaginWhile(Scanner scanner, Random random) throws InterruptedException{
        
        int[] alturas = new int[20];
        
        int i = 0;
        while (i < alturas.length){
            alturas[i] = random.nextInt(8);  
            i++;
        }
        
        System.out.print("\n================================================================\n");

        System.out.println("Alturas generadas:");
        i = 0;
        while (i < alturas.length){
            System.out.print(alturas[i] + " ");
            i++;
        }
        System.out.println("\n");
        int fila = 8;
        while (fila > 0){
            i = 0;
            while (i < alturas.length){
                if (alturas[i] >= fila) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            Thread.sleep(500);
            fila--;
        }
    }

    public static void LoadingDoWhile(Scanner scanner, Random random) throws InterruptedException{
        int[] alturas = new int[20];
        
        int i = 0;
        do {
            alturas[i] = random.nextInt(8);  
            i++;
        } while (i < alturas.length);
        
        System.out.print("\n================================================================\n");

        System.out.print("Alturas: ");
        i = 0;
        do {System.out.print(alturas[i] + " ");
            i++;
        } while (i < alturas.length);
        System.out.println("\n");
        int fila = 8;
        do {
            i = 0;
            do {
                if (alturas[i] >= fila) {
                    System.out.print("= ");
                } else {
                    System.out.print("  ");
                }
                i++;
            } while (i < alturas.length);
            System.out.println();
            Thread.sleep(500);
            fila--;
        } while (fila > 0);
        System.out.print("\n================================================================\n");
    }
}
