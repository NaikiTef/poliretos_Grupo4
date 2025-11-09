package Series_numericas;

public class SerieNumerica12 {
    private static int totalSerie;
    //Serie numerica 12 usando for
    public static void serieNumerica12For(){
        for(int i = 1; i <= 20; i++){
            totalSerie = i*(i+1);
            System.out.print(totalSerie + " ");
        }
    }

    //Serie numerica 12 usando while
    public static void serieNumerica12While(){
        int i = 1;
        while(i <= 20){
            totalSerie = i*(i+1);
            System.out.print(totalSerie + " ");
            i++;
        }
        System.out.println();
    }

    //Serie numerica 12 usando do while
    public static void serieNumerica12DoWhile(){
        int i = 1;
        do{
            totalSerie = i*(i+1);
            System.out.print(totalSerie + " ");
            i++;
        } while(i <= 20);
        System.out.println();
    }

}
