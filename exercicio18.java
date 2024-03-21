import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
         System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

         System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

          System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

         Double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

         System.out.println("A média harmônica das notas é: " + mediaHarmonica);

        scanner.close();
    }
}
