/*  Primitive Data Types    *
 *  Data In                 *
 *  Data Out                */ 

package pdtinout;

import java.util.Scanner;

public class PDTInOut {

    public static void main(String[] args) {
        float nota = 8.5f;// 'f' no final ou (float) 8.5;
        System.out.println("A nota é " + nota);// 'ln' quebrando linha
        System.out.printf("A nota é %.2f \n", nota);// formatando
        System.out.format("A nota é %.2f \n \n", nota);// formatando idem ^
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Nota: ");
        float nota1 = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n \n", nome, nota1);
        
        //Conversão de tipos
        System.out.println("Conversões de tipos:");
        int valor = 35;
        String idade = Integer.toString(valor);
        System.out.println(".toString: " + valor);
        
        String valor1 = "35";
        int idade1 = Integer.parseInt(valor1);
        System.out.println(".parseInt: " + valor1);
    }
    
}