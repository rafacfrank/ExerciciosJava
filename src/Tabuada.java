import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int multiplicador;

        do{
            System.out.println("Entre com um numero de 1 a 10 para tabuada");
            multiplicador = leitor.nextInt();
            if (multiplicador < 0 || multiplicador >10){
                System.out.println("numero invalido");
            }
        }while (multiplicador < 0 || multiplicador >10);

        for (int i = 0; i <= 10; i++) {
            int resultadoTabuada = i *multiplicador;
            System.out.println(multiplicador + " x " + i + " = " + resultadoTabuada);
        }
    }
}
