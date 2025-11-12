package Series_caracteres;

public class SerieDeCaracter6 {
    public Integer numeroAvanza;
    public void imprimirSerieSeisDeCaracter(Integer n){
        System.out.println("    ");
        System.out.println("Serie de Caracter Seis:");
        System.out.println("For:");

        for(int i=0;i<n;i++){

            if ((i+1)%2==0) {

                int variable = 1;
                if (variable%2!=0) {
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
                variable++;
                
            }else{

            char letra = (char)('a'+i);
            System.out.print(letra+" ");


        }

    }

    System.out.println(" ");
    System.out.println("Do:");
     numeroAvanza=0;
    do{
       
         if ((numeroAvanza+1)%2==0) {

                int variable = 1;
                if (variable%2!=0) {
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
                variable++;
                
            }else{

            char letra = (char)('a'+numeroAvanza);
            System.out.print(letra+" ");


        }
        numeroAvanza++;

    }while(numeroAvanza<n);
System.out.println(" ");
    System.out.println("While:");
numeroAvanza=0;
    while (numeroAvanza<n) {
         if ((numeroAvanza+1)%2==0) {

                int variable = 1;
                if (variable%2!=0) {
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
                variable++;
                
            }else{

            char letra = (char)('a'+numeroAvanza);
            System.out.print(letra+" ");


        }
        numeroAvanza++;
        
    }
}
}