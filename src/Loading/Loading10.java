package Loading;

public class Loading10 {
    
    public void loading10() {
        try {
            char[] chars = {'|', '/', '-', '\\'};
            System.out.println("\nLoading 10 - Spinner Animation");
            
            System.out.println("\nFOR:");
            for (int i = 0; i < 20; i++) {
                System.out.print("\r" + chars[i % 4] + " Loading... " + (i * 5) + "%");
                Thread.sleep(200);
            }
            
            System.out.println("\n\nWHILE:");
            int i = 0;
            while (i < 20) {
                System.out.print("\r" + chars[i % 4] + " Loading... " + (i * 5) + "%");
                Thread.sleep(200);
                i++;
            }
            
            System.out.println("\n\nDO-WHILE:");
            i = 0;
            do {
                System.out.print("\r" + chars[i % 4] + " Loading... " + (i * 5) + "%");
                Thread.sleep(200);
                i++;
            } while (i < 20);
            
            System.out.println("\n\nCompleted!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
