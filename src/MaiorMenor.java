import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com o 1º numero");
        int numberOne = leitor.nextInt();
        System.out.println("entre com o 2º numero");
        int numberTwo = leitor.nextInt();

        if (numberTwo == numberOne) {
            System.out.println("os numeros são iguais");


        } else if (numberTwo > numberOne) {
            System.out.println("O numero " + numberTwo + " é maior que " + numberOne);
        }
        else {
            System.out.println("O numero " + numberTwo + " é menor que " + numberOne);
        }
    }
}
