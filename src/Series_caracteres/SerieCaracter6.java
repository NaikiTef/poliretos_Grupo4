package Series_caracteres;

public class SerieCaracter6 {

    public void SerieCaracteres6() {

        Integer nElemetos = 5;
        Integer contador = 1;
        Integer x = 96;

        System.out.println("Sc6 con for");
        for (int i = 1; i <= nElemetos; i++) {
            if (x > 122) {
                x = 96;
            }
            System.out.println((char) (x + i));
        }
        x = 96;

        System.out.println("Sc6 con while");
        while (contador <= nElemetos) {
            if (x > 122) {
                x = 96;
            }
            System.out.println((char) (x + contador));
            contador++;
        }
        contador = 1;
        x = 96;

        System.out.println("Sc6 con do while");
        do {
            if (x > 122) {
                x = 96;
            }
            System.out.println((char) (x + contador));
            contador++;
        } while (contador <= nElemetos);
        contador = 1;
        x = 96;
    }
}
