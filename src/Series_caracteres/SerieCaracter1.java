package Series_caracteres;

public class SerieCaracter1 {
    public static void main(String[] args) {
        System.out.println("Serie de caracteres de la serie 1 usando for:");
        serieCaracteresFo();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 1 usando while:");
        serieCaracteresWh();
        System.out.println();
        System.out.println("Serie de caracteres de la serie 1 usando do while:");
        serieCaracteresDoWh();
        System.out.println();
    }

    // Serie de caracteres de la A a la Z usando for

    //Serie de caracter 1 -- bucle for 
    public static void serieCaracteresFo(){
        for(int i=0; i < 20; i++){
            if(i % 2 == 0){
                System.out.print("+" + " ");
            } else {
                System.out.print(" -" + " ");
            }
        }
    }

    //Serie de caracter 1 -- bucle while
    public static void serieCaracteresWh(){
        int i = 0;
        while(i < 20){
            if(i % 2 == 0){
                System.out.print("+" + " ");
            } else {
                System.out.print(" -" + " ");
            }
            i++;
        }
    }
    //Serie de caracter 1 -- bucle do while
    public static void serieCaracteresDoWh(){
        int i = 0;
        do{
            if(i % 2 == 0){
                System.out.print("+" + " ");
            } else {
                System.out.print(" -" + " ");
            }
            i++;
        } while(i < 20);
    }
}
