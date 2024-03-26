import java.util.Scanner;

public class exercicio19 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro: ");
          double raio = scanner.nextDouble();
        System.out.println("Digite a altura do cilindro: ");
         double altura = scanner.nextDouble();

        double volume = 3.14 * raio * raio * altura;
         System.out.println("O volume do cilindro é: " + volume);

        scanner.close();
    }
}
