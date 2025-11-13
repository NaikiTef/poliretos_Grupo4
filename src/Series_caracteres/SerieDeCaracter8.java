package Series_caracteres;

import java.util.Scanner;

public class SerieDeCaracter8 {
    
    //FOR
    public void SerieCacacterFor(Scanner scanner){
    
        System.out.print("Ingrese una letra del abecedario: ");
        char letra = scanner.next().charAt(0);

        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();


        for (int i = 0; i < numTermino; i++) {
            int repeticion = 2 * (i + 1) - 1;
            for (int j = 0; j < repeticion; j++){
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
        }
        System.out.print("\n================================================================\n");
    }

    //WHILE
    public void SerieCacacterWhile(Scanner scanner){
        
        System.out.print("Ingrese una letra del abecedario: ");
        char letra = scanner.next().charAt(0);

        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();

        int i = 0;

        while (i < numTermino) {
            int repeticion = 2 * (i + 1) - 1;
            int j = 0;
            while (j < repeticion) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            letra++;
            i++;
        }
        System.out.print("\n================================================================\n");
    }

    //DO WHILE
    public void SerieCaracterDoWhile(Scanner scanner){
        
        System.out.print("Ingrese una letra del abecedario: ");
        char letra = scanner.next().charAt(0);

        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();
        
        int i = 0;

        do{
            int repeticion = 2 * (i + 1) - 1;
            int j = 0;
            do{
                System.out.print(letra);
                j++;
        }   while (j < repeticion);
            System.out.print(" ");
            letra++;
            i++;
        }while (i < numTermino);
        
        System.out.print("\n================================================================");
    }
} 
