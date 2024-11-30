package ex_08;

public class Professor {
    private String nome;
    private double salario;
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        setNome(nome);
        setSalario(salario);
        setDisciplina(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null) {
            this.disciplina = disciplina;
        }
    }

    public void darAula() {
        System.out.println("O professor " + this.nome + " está dando aula de " + this.disciplina);
    }

    public void corrigirProvas() {
        System.out.println("O professor " + this.nome + " está corrigindo provas de " + this.disciplina);
    }
}
