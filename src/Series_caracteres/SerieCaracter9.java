package Series_caracteres;

import java.util.Scanner;

public class SerieCaracter9 {

    public void SerieCaracterFor(Scanner scanner){
        System.out.print("Ingrese una letra del abecedario: ");
        char letraInicial = scanner.next().charAt(0);

        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();

        char letraActual  = letraInicial;
        int letraAnterior = 1;
        int letraNueva    = 1;

        for (int i = 0 ; i < numTermino; i++){
            int repeticion;
            if (i < 3) {
                repeticion = 1;
            } else {
                repeticion    = letraAnterior + letraNueva;
                letraAnterior = letraNueva;
                letraNueva    = repeticion;
            }
            for (int j = 0 ; j < repeticion; j++){
                System.out.print(letraActual);
            }
            System.out.print(" ");
            letraActual++;
        }
        System.out.print("\n================================================================\n");
    }

    
    public void SerieCaracterDoWhile(Scanner scanner){
        System.out.print("Ingrese una letra del abecedario: ");
        char letraInicial = scanner.next().charAt(0);
        
        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();
        
        char letraActual  = letraInicial;
        int letraAnterior = 1;
        int letraNueva    = 1;

        int i = 0;
        while (i < numTermino){
            int repeticion;
            if(i < 3){
                repeticion = 1;
            } else {
                repeticion    = letraAnterior + letraNueva;
                letraAnterior = letraNueva;
                letraNueva    = repeticion;
            }
            int j = 0;
            while (j < repeticion){
                System.out.print(letraActual);
                j++;
            }
            System.out.print(" ");
            letraActual++;
            i++;
        }
        System.out.print("\n================================================================\n");
    }
    
    public void SerieCaracterWhile(Scanner scanner){
        System.out.print("Ingrese una letra del abecedario: ");
        char letraInicial = scanner.next().charAt(0);
    
        System.out.print("Ingrese el número de la serie progresiva: ");
        int numTermino = scanner.nextInt();
    
        char letraActual  = letraInicial;
        int letraAnterior = 1;
        int letraNueva    = 1;
        
        int i = 0;
        do{
            int repeticion;
            if (i < 3) {
                repeticion = 1;
            } else {
                repeticion    = letraAnterior + letraNueva;
                letraAnterior = letraNueva;
                letraNueva    = repeticion;
            }
            int j = 0;
            do{
                System.out.print(letraActual);
                j++;
            } while (j < repeticion);
            System.out.print(" ");
            letraActual++;
            i++;
        } while (i < numTermino);
        System.out.print("\n================================================================\n");
    }
}
