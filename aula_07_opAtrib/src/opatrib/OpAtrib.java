package opatrib;
public class OpAtrib {
    public static void main(String[] args) {
        
        int n1 = 9;
        int n2 = 3;

        n1 *=  n2;// n1 recebe 27 (9 * 3)
        System.out.println("(*=)n1: " + n1);
        
        n1 /=   n2;// n1 recebe 9 (27 / 3)
        System.out.println("(/=)n1: " + n1);
        
        n1 +=  n2;// n1 recebe 12 (9 + 3)
        System.out.println("(+=)n1: " + n1);
        
        n1 -=   n2;// n1 recebe 9 (12 - 3)
        System.out.println("(-=)n1: " + n1);
        
        n1 %= n2;// n1 recebe 0 (9 % 3)
        System.out.println("(%=)n1: " + n1);
    }
}
