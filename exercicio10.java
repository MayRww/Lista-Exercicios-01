import java.util.Scanner;

public class exercicio10 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Um");
        } else if (numero == 2) {
            System.out.println("Dois");
        } else if (numero == 3) {
            System.out.println("Três");
        } else if (numero == 4) {
            System.out.println("Quatro");
        } else if (numero == 5) {
            System.out.println("Cinco");
        } else {
            System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
