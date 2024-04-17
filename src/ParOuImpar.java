import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com um numero");
        int parOuImpar = leitor.nextInt();
        int sobra;
        sobra = parOuImpar % 2;

        if (sobra == 1){
            System.out.println("este numero é Impar");
        } else {
            System.out.println("este numero é Par");
        }



    }
}
