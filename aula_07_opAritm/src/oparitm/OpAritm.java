package oparitm;
import java.util.Scanner;
public class OpAritm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro Nº: ");
        float n1 = input.nextFloat();
        System.out.print("Segundo Nº: ");
        float n2 = input.nextFloat();
        float mul = n1 * n2;
        float div = n1 / n2;
        float res = n1 % n2;
        float som = n1 + n2;
        float sub = n1 - n2;
        System.out.println("Resultados:");
        System.out.format("Multiplicação %.2f:\n", mul);
        System.out.format("Divisão %.2f:\n", div);
        System.out.format("Resto %.2f:\n", res);
        System.out.format("Soma %.2f:\n", som);
        System.out.format("Subtração %.2f:\n", sub);
    }
}
