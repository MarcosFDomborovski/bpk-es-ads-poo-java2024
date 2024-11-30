package ex_07;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null) {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null) {
            this.curso = curso;
        }
    }

    public int calcularMedia(int n1, int n2) {
        return (n1 + n2) / 2;
    }
}
