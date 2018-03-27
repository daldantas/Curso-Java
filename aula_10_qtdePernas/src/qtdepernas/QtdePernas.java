package qtdepernas;
import java.util.Scanner;
public class QtdePernas {
    public static void main(String[] args) {
        System.out.print("Digite o nº de pernas da criatura: ");
        Scanner qtdePern = new Scanner(System.in);
        int qp = qtdePern.nextInt();
        String tipo;
        switch (qp)  {
            case 2:
                tipo = "Bípede.";
                break;
            case 4:
                tipo = "Quadrúpede.";
                break;
            case 8:
                tipo = "Aracnídeo.";
                break;
            default:
                tipo = "Alienígena.";
                break;
        }
        System.out.println(" É um " + tipo); 
    }
}
