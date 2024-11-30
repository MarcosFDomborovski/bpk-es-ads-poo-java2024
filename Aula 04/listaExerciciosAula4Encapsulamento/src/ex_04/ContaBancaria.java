package ex_04;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    // Getters e Setters com validação
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
