import java.util.Scanner;

public class exercicio15 {
    public static void executar()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
         System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distanciaAoQuadrado = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
         double distancia = distanciaAoQuadrado;

        
        System.out.println("A distância ao quadrado entre os pontos P1 e P2 é: " + distanciaAoQuadrado);
  
        System.out.println("A distância entre os pontos P1 e P2 é: " + distancia);

        scanner.close();
    }
}

