import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um numero para calcular fatorial ");
        int nunmber = leitor.nextInt();
        int fatorial = 1;

        for (int i = nunmber; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial " + nunmber + "! é : " + fatorial);
        System.out.println("Adeus");
    }
}
