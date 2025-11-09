package Series_numericas;

public class SerieNumerica2 {

    //Serie numerica 2 usando for
    public static void serieNumerica2For(){
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + 1);
            } else {
                System.out.print(" 0 ");
            }
        }
        System.out.println();
    }

    //Serie numerica 2 usando while
    public static void serieNumerica2While(){
        int i = 0;
        while(i <= 20){
            if(i % 2 == 0){
                System.out.print(i + 1);
            } else {
                System.out.print(" 0 ");
            }
            i++;
        }
        System.out.println();
    }

    //Serie numerica 2 usando do while
    public static void serieNumerica2DoWhile(){
        int i = 0;
        do{
            if(i % 2 == 0){
                System.out.print(i + 1);
            } else {
                System.out.print(" 0 ");
            }
            i++;
        } while(i <= 20);
        System.out.println();

    }
}