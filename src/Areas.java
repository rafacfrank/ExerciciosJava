import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String menu = """
                       MENU
                SELECIONE UMA OPÇÃO:
                DIGITE O NUMERO
                1: Área do quadrado
                2: Área do círculo
                """.formatted();
        System.out.println(menu);
        int opcao;

        do {
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("vc escolheu Area do quadrado");
                    System.out.println("Escreva o tamanho do lado do quadrado em metros");
                    int ladoQuadrado = leitor.nextInt();
                    int quadrado = ladoQuadrado * ladoQuadrado;
                    System.out.println(("o quadrado tem uma area de " + quadrado + " m2"));
                    break;
                case 2:
                    System.out.println("vc escolheu circulo");
                    System.out.println("vc escolheu Area do Circulo");
                    System.out.println("Escreva o raio circulo em metros");
                    int raioCirculo = leitor.nextInt();
                    double circulo = 3.14 * Math.pow(raioCirculo,2);
                    System.out.println(("o circulo tem uma area de " + circulo + " m2"));
                    break;
                default:
                    System.out.println("Escolha uam opção valida");
                    break;

            }
        } while (opcao != 1 && opcao != 2);
    }
}
