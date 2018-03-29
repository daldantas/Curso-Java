package estrrep2;

import java.util.Scanner;

public class EstrRep2 {
    public static void main(String[] args) {
        
        int n, nf = 0;
        Scanner t = new Scanner(System.in);
        String r;
        do {
            System.out.print("Digite um número: ");
            n = t.nextInt();
            nf += n;
            System.out.print("Continuar? [s/n]");
            r = t.next();
        } while (r.equals("s"));
        System.out.println("Total: " + nf);
    }
}
