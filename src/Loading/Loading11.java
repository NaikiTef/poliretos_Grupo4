package Loading;

public class Loading11 {
   
    public void loading11(Integer n) {
        try {
            if (n < 0 || n > 10) {
                System.out.println("Valor fuera de rango.");
                return;
            }

            System.out.println("\nFOR:");
            for (int i = 1; i <= n; i++) {
                dibujar(i);
                Thread.sleep(350);
            }

            System.out.println("\nWHILE:");
            int i = 1;
            while (i <= n) {
                dibujar(i);
                Thread.sleep(350);
                i++;
            }

            System.out.println("\nDO-WHILE:");
            i = 1;
            do {
                dibujar(i);
                Thread.sleep(350);
                i++;
            } while (i <= n);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void dibujar(int nivel) {
        String izq = "-".repeat(nivel);
        String der = "-".repeat(nivel);
        String eje = "|";

        System.out.println(izq + eje + der + "   " + nivel + " es el nivel");
    }
}