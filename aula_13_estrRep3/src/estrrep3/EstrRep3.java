package estrrep3;
public class EstrRep3 {
    public static void main(String[] args) throws InterruptedException{
        for (int h = 0; h < 1; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    
                    System.out.print(h+":"+m+":"+s + " ");
                    Thread.sleep(1000);
                }
            }
        }
    }
}
