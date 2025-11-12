package Arrays;

public class Array04 {
    Integer numeroAvanza;

    public void imprimirArray04(String texto){
        
            int n = texto.length();
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = ' ';

        for (int i = 0; i < n; i++) {
            matriz[i][i] = texto.charAt(i);
            matriz[i][n - 1 - i] = texto.charAt(i);
        }

        System.out.println("\nFOR:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(matriz[i][j]);
            System.out.println();
        }

        System.out.println("\nWHILE:");
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) { System.out.print(matriz[i][j]); j++; }
            System.out.println();
            i++;
        }

        System.out.println("\nDO-WHILE:");
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matriz[i][j]);
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
    }

                
}
