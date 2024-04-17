import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        //System.out.println(numeroSorteado + " foi o numero sorteado");
        System.out.println("");




        for (int i = 4; i >= 0; i--) {
            System.out.println("Entre com seu chute:");
            int chute = leitura.nextInt();

            if(numeroSorteado != chute && numeroSorteado < chute) {
                System.out.println("você tem ainda " + i + " tentativas");
                System.out.println("o numero é diferente e MAIOR do qual foi sorteado");
            }

            if(numeroSorteado != chute && numeroSorteado > chute) {
                System.out.println("você tem ainda " + i + " tentativas");
                System.out.println("o numero é diferente e MENOR do qual foi sorteado");
            }
            if(numeroSorteado == chute){
                System.out.println("parabens, vc acertou");
                break;
            }


        }
        System.out.println(numeroSorteado + " foi o numero sorteado, voce perdeu, FIM");

    }
}
