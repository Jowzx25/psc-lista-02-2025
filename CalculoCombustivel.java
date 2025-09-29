import java.util.Scanner;

public class CalculoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preco do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double valorTotal = precoLitro * litrosVendidos;

        System.out.println("O cliente devera pagar R$ " + valorTotal);

        scanner.close();
    }
}