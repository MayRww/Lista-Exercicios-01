import java.util.Scanner;

public class exercicio16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
         double nota01 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
         double nota02 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
         double nota03 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03) / 3;
       
         System.out.println("A média aritmética das notas é: " + media);

        scanner.close();
    }
}
