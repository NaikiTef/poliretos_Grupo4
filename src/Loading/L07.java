package Loading;

public class L07 {

    public void Loading7() {
        int barra = 20;
        Integer espacios = barra - 1;
        Integer porcentaje = 0;
        Integer contador = -1;
        char rueda[] = { '\\', '|', '/', '-' };

        System.out.println("l07 con for");
        try {
            for (int i = 0; i < barra; i++) {
                contador++;
                if (contador > 3) {
                    contador = 0;
                }
                System.out.print("\r[" + "=".repeat(i) + rueda[contador] + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = -1;

        System.out.println("l07 con while");
        try {
            while (porcentaje < 100) {
                contador++;
                if (contador > 3) {
                    contador = 0;
                }
                System.out.print("\r[" + "=".repeat(porcentaje / 5) + rueda[contador] + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = -1;

        System.out.println("l07 con  do while");
        try {
            do {
                contador++;
                if (contador > 3) {
                    contador = 0;
                }
                System.out.print("\r[" + "=".repeat(porcentaje / 5) + rueda[contador] + " ".repeat(espacios--) + "]");
                System.out.print((porcentaje += 5) + "%");
                Thread.sleep(400);
            } while (porcentaje < 100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        espacios = barra - 1;
        porcentaje = 0;
        contador = -1;
    }

}
