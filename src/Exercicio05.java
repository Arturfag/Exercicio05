import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        // Declaraçao de variaveis
        Scanner sc = new Scanner(System.in);
        double salariominimo, valorkwatt, valorconta;
        int qtdKwatt;

        // Entrada de dados
        System.out.println("Informe o valor do salario minimo $  ");
        salariominimo = sc.nextDouble();
        System.out.println("Informe a quantidade de quilowatt  ");
        qtdKwatt = sc.nextInt();

        // Processamento de dados
        valorkwatt = salariominimo / 7 / 100;
        valorconta = qtdKwatt * valorkwatt;


        // Saida de dados
        System.out.println("Valor da conta R$  " + valorconta); //valor a ser pago pela residencia
        System.out.println("Valor do quilowatt R$  " + valorkwatt);  // valor em real de cada quilowatt
        System.out.println("Valor da conta com 10% de desconto  " + valorconta * 0.9 );

    }
}
