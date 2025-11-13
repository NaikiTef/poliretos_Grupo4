package Loading;

import java.util.Scanner;


public class Loading12 {
    
    private static void imprimirFiguraConEspacios(String[] figura, int espacios) {
        String sp = " ".repeat(espacios);
        for (String linea : figura) {
            System.out.println(sp + linea);
        }
    }

    private static void limpiarPantalla() {
        for (int i = 1; i < 15; i++) {
            System.out.println();
        }
    }
    
    public static void LoadingFor(Scanner scanner) throws InterruptedException{
                
        String[] figura = {
            "    /||/   ",
            "   (>  <)  ",
            "ooO-(_)-Ooo"
        };

        int maxDesplazamiento = 15; 
        int delay = 100; 
        
        for (int rep = 0; rep < 1; rep++) {
            //IZQUIERDA A DERECHA
            for (int espacio = 0; espacio <= maxDesplazamiento; espacio++) {
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                limpiarPantalla();

            }
            //DERECHA A IZQUIERDA
            for (int espacio = maxDesplazamiento - 1; espacio >= 0; espacio--) {
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                limpiarPantalla();

            }
        }
        System.out.print("\n================================================================\n");
    }

    public static void LoadingWhile(Scanner scanner) throws InterruptedException{
        String[] figura = {
            "    /||/   ",
            "   (>  <)  ",
            "ooO-(_)-Ooo"
        };

        int maxDesplazamiento = 15;
        int delay = 150;
        
        int repeticionIdaVuelta = 1; 
        int rep = 0;
        while (rep < repeticionIdaVuelta) {
            int espacio = 0;
            // Avanzar a la derecha
            while (espacio <= maxDesplazamiento) {
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                espacio++;
            }
            espacio = maxDesplazamiento - 1;
            while (espacio >= 0) {
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                espacio--;
            }
            rep++;
        }
        System.out.print("\n================================================================\n");
    }
    
    public static void LoadingDoWhile(Scanner scanner) throws InterruptedException{
        String[] figura = {
            "    /||/   ",
            "   (>  <)  ",
            "ooO-(_)-Ooo"
        };

        int maxDesplazamiento = 15;
        int delay = 150;
        
        int repeticionIdaVuelta = 1;
        int rep = 0;
        do{
            int espacio = 0;
            
            do{
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                espacio++;
            } while (espacio <= maxDesplazamiento);
            
            espacio = maxDesplazamiento - 1;

            do{
                limpiarPantalla();
                imprimirFiguraConEspacios(figura, espacio);
                Thread.sleep(delay);
                espacio--;
            } while (espacio >= 0);

            rep++;

        } while (rep < repeticionIdaVuelta);
        
        System.out.print("\n================================================================\n");
    }
}
