import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        // Declarando variaveis
        Scanner sc = new Scanner(System.in);
        double valorhora, porcentagemINSS;
        int horastrabalhadas;
        double salariobruto, salarioliquido;
        double valorDeDesconto;

        // Entradada de dados
        System.out.println("Digite o valor da hora aula ");
        valorhora = sc.nextDouble();
        System.out.println("Digite as horas trabalhadas  ");
        horastrabalhadas = sc.nextInt();
        System.out.println("Digite a porcentagem do INSS  ");
        porcentagemINSS = sc.nextDouble();

        // Processamento de dados
        salariobruto = valorhora * horastrabalhadas;
        valorDeDesconto = salariobruto * porcentagemINSS / 100;
        salarioliquido  = salariobruto - valorDeDesconto;

        // Saida de dados
        System.out.println("Valor do salario bruto   " + salariobruto);
        System.out.println("Valor do desconto   " + valorDeDesconto);
        System.out.println("Valor salario liquido   " + String.format("%.2f", salarioliquido));


    }
}
