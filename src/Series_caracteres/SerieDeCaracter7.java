package Series_caracteres;

public class SerieDeCaracter7 {

    public Integer numeroAvanza;
    public void imprimirSerieSieteDeCaracter(Integer n){
        System.out.println(" ");
        System.out.println("Serie de Caracter Siete:");

        System.out.println("For:");
        char letra='a';
        numeroAvanza=1;

            for(int i=1;i<n*2;i++){
                if ((i+1)%2==0) {
                    
                
                for(int j=0;j<i+1;j++){
                    
                    System.out.print(letra);    
                    
                    
                }
                System.out.print(" ");
               letra = (char)('a'+numeroAvanza);
               numeroAvanza++;
            }               
            }


            System.out.println(" ");
            System.out.println("Do:");
            letra='a';
            numeroAvanza=1;
            int i=1;
            do{
                if ((i+1)%2==0) {
                    
                
                for(int j=0;j<i+1;j++){
                    
                    System.out.print(letra);    
                    
                    
                }
                System.out.print(" ");
               letra = (char)('a'+numeroAvanza);
               numeroAvanza++;
               
            }   
            i++;            
            }while(i<n*2);

            System.out.println(" ");
            System.out.println("While:");
            letra='a';
            numeroAvanza=1;
            i=1;

            while (i<n*2) {
                if ((i+1)%2==0) {
                    
                
                for(int j=0;j<i+1;j++){
                    
                    System.out.print(letra);    
                    
                    
                }
                System.out.print(" ");
               letra = (char)('a'+numeroAvanza);
               numeroAvanza++;
               
            }   
            i++;      
            }

    }
}
