import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Criando contas correntes
        ContaCorrente conta1 = new ContaCorrente(1001, "João Silva", 1000.0, 500.0);
        ContaCorrente conta2 = new ContaCorrente(1002, "Maria Oliveira", 2000.0, 700.0);

        // Adicionando contas aos clientes
        cliente1.adicionarConta(conta1);
        cliente2.adicionarConta(conta2);

        // Operações com a conta de João Silva
        System.out.println("\nOperações com a conta de João Silva:");
        System.out.print("Digite o valor a ser depositado para João Silva: ");
        double depositoJoao = scanner.nextDouble();
        conta1.depositar(depositoJoao);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());

        System.out.print("Digite o valor a ser sacado por João Silva: ");
        double saqueJoao = scanner.nextDouble();
        conta1.sacar(saqueJoao);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        // Operações com a conta de Maria Oliveira
        System.out.println("\nOperações com a conta de Maria Oliveira:");
        System.out.print("Digite o valor a ser depositado para Maria Oliveira: ");
        double depositoMaria = scanner.nextDouble();
        conta2.depositar(depositoMaria);
        System.out.println("Saldo após depósito: " + conta2.getSaldo());

        System.out.print("Digite o valor a ser sacado por Maria Oliveira: ");
        double saqueMaria = scanner.nextDouble();
        conta2.sacar(saqueMaria);
        System.out.println("Saldo após saque: " + conta2.getSaldo());

        System.out.println("\nSaldo final:");
        System.out.println(cliente1.getNome() + ": R$ " + conta1.getSaldo());
        System.out.println(cliente2.getNome() + ": R$ " + conta2.getSaldo());

        scanner.close();
    }
}
