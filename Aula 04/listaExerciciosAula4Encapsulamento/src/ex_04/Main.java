package ex_04;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("1234", 1000);
        conta.depositar(1000);
        conta.sacar(500);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
