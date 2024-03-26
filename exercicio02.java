import java.util.Scanner;

public class exercicio02 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}

