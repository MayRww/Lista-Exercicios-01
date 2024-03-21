import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo de viagem em horas: ");
         double tempoViagemHoras = scanner.nextDouble();
        System.out.println("Digite a velocidade média da viagem em km/h: ");
         double velocidadeMediaKmPorHora = scanner.nextDouble();
         double distanciaPercorridaKm = tempoViagemHoras * velocidadeMediaKmPorHora;
         double litrosCombustivelGastos = distanciaPercorridaKm / 12;
        System.out.println("A quantidade de litros de combustível gasta é: " + litrosCombustivelGastos);

        scanner.close();
    }
}
