package Series_caracteres;

public class SerieCaracter2 {

    public static void main(String[] args) {
        System.out.println("Serie de caracteres de la serie 2 usando for:");
        serieCaracter2For();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando while:");
        serieCaracter2While();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 2 usando do while:");
        serieCaracter2DoWhile();
        System.out.println();
    }

    //Serie de caracter 2 -- bucle for
    public static void serieCaracter2For(){

        StringBuilder seriemas= new StringBuilder();
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                seriemas.append('+');
            }
            seriemas.append( ' ');
        }
        System.out.println(seriemas.toString());
    }

    public static void serieCaracter2While(){

        StringBuilder seriemas= new StringBuilder();
        int i = 1;
        while(i <= 10){
            int j = 1;
            while(j <= i){
                seriemas.append('+');
                j++;
            }
            seriemas.append( ' ');
            i++;
        }
        System.out.println(seriemas.toString());
    }

    public static void serieCaracter2DoWhile(){

        StringBuilder seriemas= new StringBuilder();
        int i = 1;
        do{
            int j = 1;
            do{
                seriemas.append('+');
                j++;
            } while(j <= i);
            seriemas.append( ' ');
            i++;
        } while(i <= 10);
        System.out.println(seriemas.toString());
    }

}
