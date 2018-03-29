package estrrep2joptionpane;
import javax.swing.JOptionPane;
public class EstrRep2JOptionPane {
    public static void main(String[] args) {
        int n, s = 0, c=0, p = 0, i = 0, aCem = 0;   
        do {
                n = Integer.parseInt(JOptionPane.showInputDialog("Soma sucessiva[0 interrompe]:"));
                s += n;

            // total de valores
                c++;

            // total pares e ímpares
                 if ((n % 2) == 0) {
                    p++;
                } else {
                     i++;
                 }

            // Qtde acima de cem
                 if (n > 100) {
                    aCem++;
                } 
        } while (n != 0);
        // DECREMENTA OS QUE FORAM INCREMENTADOS NA SAÍDA '0'
            --c;
            --p;
            
        // Média dos valores
        String m = String.format("%.1f",(float) s / c);
  
       // Painel de resultados
        JOptionPane.showMessageDialog(null, 
            "Total de valores: " + c +
            "\n Pares: " + p +
            "\n Ímpares: " + i +
            "\n Acima de 100: " + aCem +
            "\n Média: " + m +
            "\n Valor total: " + s , "- - Resultado Final - -", JOptionPane.PLAIN_MESSAGE);
    }
}
