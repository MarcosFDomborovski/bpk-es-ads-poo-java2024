public class ContaCorrente {
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                '}';
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldo + limiteSaque) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

}
