import java.util.Scanner;

public class Soma{

    public static void main(String[] args) {
    // exercicio 1
        double nota1 = 95.45;
        double nota2 = 59.78;
        System.out.println((nota1+nota2)/2);


    //exercicio 2
        int variavel1;
        double variavel2 = 23.2;

        variavel1 = (int) variavel2;
        System.out.println(variavel1);

    //exercicio 3
        char letra = 'x';
        String palavra = "alface";
        System.out.println(palavra + letra);

    //exercicio 4
        double preco;
        int quantidade;

        preco = 21.2;
        quantidade = 16;

        double precoFinal = preco * quantidade;
        String mensagem = """
                Temos aqui o valor total do produto %.2f
                """.formatted(precoFinal);
        System.out.println(mensagem);

    //exercicio 5
        double cotacao = 4.94;
        double valorEmReais = 15.90;
        double valorEmDolar = cotacao * valorEmReais;
        String textoConversao = """
                O valor de R$%.2f convertido pela cotação fator %.2f é USD$%.2f
                """.formatted(valorEmReais, cotacao, valorEmDolar );
        System.out.println(textoConversao);

    //exercicio 6
        double desconto = 10;
        double valorOriginal = 456.45;
        double valorDesconto = valorOriginal - ((valorOriginal*desconto)/100);
        String valorDescontoFormatado = String.format("%.2f",valorDesconto);
        System.out.println(valorDescontoFormatado);

    //exemplo da aula de lietura
        Scanner lendo = new Scanner(System.in);

        System.out.print("entre com seu nome");
        String nome = lendo.nextLine();

        System.out.print("entre com sua idade");
        int idade = lendo.nextInt();

        System.out.print("entre com seu peso");
        int peso = lendo.nextInt();

        double pesoPorIdade = peso / idade;

        System.out.println("a cada ano você juntou peso, confira quanto a cada ano:" + pesoPorIdade);
    }
}
