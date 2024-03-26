import java.util.Scanner;

public class exercicio03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A é maior que B.");
        } else if (B > A) {
            System.out.println("B é maior que A.");
        } else {
            System.out.println("A sequência de números informada é inválida, pois os números são iguais.");
        }

        scanner.close();
    }
}

