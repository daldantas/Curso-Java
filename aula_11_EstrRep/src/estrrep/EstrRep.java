package estrrep;
public class EstrRep {
    public static void main(String[] args) {
        int n = 0;
        while (n < 15) {
            
            n++;
            
            if (n  ==  10) {
                break;
            }
            
            if (n == 1   ||   n == 3   ||   n == 6  ||  n == 9) {
                continue;
            }
            
            System.out.print(n  +  "  "); 
        }
    }
}
