package ex_22;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        setNome(nome);
        setCnpj(cnpj);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            throw new IllegalArgumentException("CNPJ não pode ser nulo ou vazio");
        }
        this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void contratarFuncionario() {
        System.out.println("Contratando funcionário");
        this.numeroFuncionarios++;
    }

    public void demitirFuncionario() {
        System.out.println("Demitindo funcionário");
        this.numeroFuncionarios--;
    }

    public void mostrarFuncionarios() {
        System.out.println("Na empresa tem " + this.numeroFuncionarios + " funcionários");
    }
}
