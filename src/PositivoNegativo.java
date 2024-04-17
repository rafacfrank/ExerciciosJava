import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com um numero para saber se POSITIVO ou Negativo: ");
        int numero1 = scanner.nextInt();

        if (numero1 < 0){
            System.out.println("numero negativo");
        }
        else {
            System.out.println("numero Positivo");
        }

    }
}
