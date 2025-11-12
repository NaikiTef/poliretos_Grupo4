package Series_caracteres;

public class SerieCaracter5 {

    public void serieCaracteres5() {

        Integer nElemetos = 15;
        Integer x = -1;
        Integer contador = 0;
        char array[] = { '\\', '|', '/', '-', '|' };

        System.out.println("Sc5 cn for");
        for (int i = 0; i < nElemetos; i++) {
            x++;
            if (x > 4) {
                x = 0;
            }
            System.out.print(array[x] + " ");
        }

        System.out.println("\nSc5 con while");
        while (nElemetos > contador) {
            x++;
            if (x > 4) {
                x = 0;
            }
            System.out.print(array[x] + " ");
            contador++;
        }
        contador = 0;
        System.out.println("\nSc5 con do while");
        do {
            x++;
            if (x > 4) {
                x = 0;
            }
            System.out.print(array[x] + " ");
            contador++;
        } while (nElemetos > contador);
        contador = 0;
    }

}
