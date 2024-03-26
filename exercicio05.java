import java.util.Scanner;

public class exercicio05 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        // Troca dos valores sem variável temporária
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}
