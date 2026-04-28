import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Digite o valor 1 -->  ");
        valor1 = sc.nextInt();
        System.out.println("Digite o valor 2 -->  ");
        valor2 = sc.nextInt();
        System.out.println("Digite o valor 3 -->  ");
        valor3 = sc.nextInt();

        // SE valor1 eh diferente de valor2 E valor1 diferente de valor3 e valor2 diferente de valor3
        if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
            if (valor1 < valor2 && valor1 < valor3){
                System.out.println("menor = " + valor1);
            }
            else if (valor2 < valor3) {
                System.out.println("menor = " + valor2);
            }
            else System.out.println("menor = " + valor3);

        }
        else {
            System.out.println("os valores devem ser diferentes ");
        }





    }
}
