package Loading;

public class L09 {
    
    public void loading09(String nombre) {
        try {
            int total = nombre.length();
            System.out.println("\nFOR:");
            for (int i = 0; i < total; i++) {
                int porcentaje = (int) (((i + 1) * 100.0) / total);
                System.out.println(nombre.charAt(i) + "   " + porcentaje + "%");
                Thread.sleep(400);
            }

            System.out.println("\nWHILE:");
            int i = 0;
            while (i < total) {
                int porcentaje = (int) (((i + 1) * 100.0) / total);
                System.out.println(nombre.charAt(i) + "   " + porcentaje + "%");
                Thread.sleep(400);
                i++;
            }

            System.out.println("\nDO-WHILE:");
            i = 0;
            do {
                int porcentaje = (int) (((i + 1) * 100.0) / total);
                System.out.println(nombre.charAt(i) + "   " + porcentaje + "%");
                Thread.sleep(400);
                i++;
            } while (i < total);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}