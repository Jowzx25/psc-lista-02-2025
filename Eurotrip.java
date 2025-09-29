import java.util.Scanner;

public class Eurotrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Planejamento de Eurotrip!");

        System.out.println("\n--- Destino: Alemanha ---");
        System.out.print("Digite o preco da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Digite o numero de pessoas que irao para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();
        double totalAlemanha = precoAlemanha * pessoasAlemanha;

        System.out.println("\n--- Destino: Portugal ---");
        System.out.print("Digite o preco da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Digite o numero de pessoas que irao para Portugal: ");
        int pessoasPortugal = scanner.nextInt();
        double totalPortugal = precoPortugal * pessoasPortugal;

        System.out.println("\n--- Destino: Italia ---");
        System.out.print("Digite o preco da viagem para a Italia: ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Digite o numero de pessoas que irao para a Italia: ");
        int pessoasItalia = scanner.nextInt();
        double totalItalia = precoItalia * pessoasItalia;

        double valorTotal = totalAlemanha + totalPortugal + totalItalia;
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.println("\n--- Resumo da Viagem ---");
        System.out.println("Valor total para a Alemanha: R$ " + String.format("%.2f", totalAlemanha));
        System.out.println("Valor total para Portugal: R$ " + String.format("%.2f", totalPortugal));
        System.out.println("Valor total para a Italia: R$ " + String.format("%.2f", totalItalia));
        System.out.println("-------------------------");
        System.out.println("Valor total da Eurotrip: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Numero total de pessoas que irao nas viagens: " + totalPessoas);
        
        scanner.close();
    }
}