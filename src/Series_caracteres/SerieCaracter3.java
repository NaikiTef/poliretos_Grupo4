package Series_caracteres;

public class SerieCaracter3 {
    public static void main(String[] args) {
        System.out.println("Serie de caracteres de la serie 2 usando for:");
        serieCaracter3For();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando while:");
        serieCaracter3While();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando do while:");
        serieCaracter3DoWhile();
        System.out.println();
    }


    //Serie con FOR
    public static void serieCaracter3For(){

        System.out.println("S3 For: ");
        int contador = 0; 
        int num = 2;

        System.out.println("Serie con FOR:");
        for (; contador < 6; num++) { // Genera los primeros 6 primos
            if (esPrimo(num)) {
                for (int j = 0; j < num; j++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                contador++;
            }
        }
        System.out.println("\n");
}


// Serie con WHILE
    public static void serieCaracter3While(){
        int contador = 0; 
        int num = 2;

        System.out.println("Serie con WHILE:");
        while (contador < 6) { // Genera los primeros 6 primos
            if (esPrimo(num)) {
                int j = 0;
                while (j < num) {
                    System.out.print("+");
                    j++;
                }
                System.out.print(" ");
                contador++;
            }
            num++;
        }
        System.out.println("\n");
}

//Serie con DO WHILE
    public static void serieCaracter3DoWhile(){
        int contador = 0; 
        int num = 2;

        System.out.println("Serie con DO WHILE:");
        do { // Genera los primeros 6 primos
            if (esPrimo(num)) {
                int j = 0;
                do {
                    System.out.print("+");
                    j++;
                } while (j < num);
                System.out.print(" ");
                contador++;
            }
            num++;
        } while (contador < 6);
        System.out.println("\n");
}

// Funcion auxiliar
// Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
