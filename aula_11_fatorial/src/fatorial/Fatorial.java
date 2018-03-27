package fatorial;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Calculadora de Fatorial (!)");
        System.out.print("Digite um nº:  ");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int c = 1;
        while (n > 0) {
            System.out.print(n + " . ");
            c *= n;
            n--;
            if(n == 1) {
                System.out.println("1 = " + c);
                break;
            }
        }
    }
}
