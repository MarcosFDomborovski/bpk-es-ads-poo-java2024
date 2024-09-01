public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void contratarFuncionario(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println("\nForam contratados " + quantidade + " funcionários. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("\nNúmero inválido de funcionários para contratar.");
        }
    }

    public void demitirFuncionario(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println("\nForam demitidos " + quantidade + " funcionários. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("\nNúmero inválido de funcionários para demitir.");
        }
    }
}
