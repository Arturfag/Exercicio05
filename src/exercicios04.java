import java.util.Scanner;

public class exercicios04 {
    public static void main(String[] args) {

        // Decalraçao de dados
        Scanner sc = new Scanner(System.in);
        double altura, base;
        double area, perimetro;

        // entrada de dados
        System.out.println("Digite o valor da base    ");
        base = sc.nextDouble();

        System.out.println("Digite o valor da altura  ");
        altura = sc.nextDouble();

        // Processamento de dados
        area = base * altura;
        perimetro =  2 * (base + altura);

        // Saida de dados
        System.out.println("área = " + area);
        System.out.println("perímetro = " + perimetro);


    }
}
