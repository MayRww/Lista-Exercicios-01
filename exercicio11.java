import java.util.Scanner;

public class exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        int menor, intermediario, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                intermediario = valor2;
                maior = valor3;
            } else {
                intermediario = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                intermediario = valor1;
                maior = valor3;
            } else {
                intermediario = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                intermediario = valor1;
                maior = valor2;
            } else {
                intermediario = valor2;
                maior = valor1;
            }
        }

        System.out.println("Os valores em ordem crescente são: " + menor + ", " + intermediario + ", " + maior);

        scanner.close();
    }
}
