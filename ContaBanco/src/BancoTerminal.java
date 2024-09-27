
import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        double valorSolicitado;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o saldo da conta: ");
            saldo = scanner.nextDouble();
        
            System.out.println("Digite o numero da agencia: ");
            agencia = scanner.next();
            System.out.println("Digite o numero da conta: ");
            numero = scanner.nextInt();
            System.out.println("Digite o nome do cliente: ");
            nomeCliente = scanner.next();
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em noso banco. A sua agencia e conta: " + agencia + "-" + numero + ". Seu saldo de R$" + saldo + " ja esta disponível para saque.");

            System.out.println("Digite o valor que deseja sacar: ");
            valorSolicitado = scanner.nextDouble();
        }

        if (valorSolicitado <= saldo) {
            System.out.println("Solicitacao efetuada com sucesso!");
            System.out.println("Seu novo saldo eh de: " + (saldo - valorSolicitado));
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Seu saldo eh de: " + saldo);
        }
    }
}
