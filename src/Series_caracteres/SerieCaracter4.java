package Series_caracteres;

public class SerieCaracter4 {
        public static void main(String[] args) {
        System.out.println("Serie de caracteres de la serie 2 usando for:");
        serieCaracter4For();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando while:");
        serieCaracter4While();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando do while:");
        serieCaracter4DoWhile();
        System.out.println();
    }




    // Serie con FOR
    public static void serieCaracter4For() {
        System.out.println("S4 FOR:");
        char[] simbolos = {'+', '-', '*', '/'};

        for (int i = 0; i < 20; i++) { // Genera los primeros 20 símbolos
            System.out.print(simbolos[i % 4] + " ");
        }
        System.out.println();
    }

    // Serie con WHILE
    public static void serieCaracter4While() {
        System.out.println("S4 WHILE:");
        char[] simbolos = {'+', '-', '*', '/'};
        int i = 0;

        while (i < 20) {
            System.out.print(simbolos[i % 4] + " ");
            i++;
        }
        System.out.println();
    }

    // Serie con DO WHILE
    public static void serieCaracter4DoWhile() {
        System.out.println("S4 DO WHILE:");
        char[] simbolos = {'+', '-', '*', '/'};
        int i = 0;

        do {
            System.out.print(simbolos[i % 4] + " ");
            i++;
        } while (i < 20);
        System.out.println();
    }

}
