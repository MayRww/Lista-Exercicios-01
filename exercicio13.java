import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;

      
        if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
            if (operador == '+') {
                resultado = A + B;
            } else if (operador == '-') {
                resultado = A - B;
            } else if (operador == '*') {
                resultado = A * B;
            } else if (operador == '/') {
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
            }
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operador não definido!");
        }

        scanner.close();
    }
}
