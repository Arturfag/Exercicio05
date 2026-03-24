import java.util.Scanner;

public class exercicios02 {
    public static void main(String[] args) {

        // Declaraçao de Váriaveis
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        
        // Entrada de dados 
        System.out.println("Digite o valor em C°");
        celsius = sc.nextDouble();


        // Processamento de dados 
        fahrenheit = (celsius * 9 / 5) + 32;
        
        
        
        
        // Saída de dados 
        System.out.println( "Em graus celsius é:   " + celsius);
        System.out.println("Em Fahrenheit é:   " + fahrenheit);

    }
}
