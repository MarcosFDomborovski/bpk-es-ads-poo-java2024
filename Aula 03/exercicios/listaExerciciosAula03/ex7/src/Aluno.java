// 7 - Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.
public class Aluno {
    String nome;
    int matricula;
    String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public double calcularMedia(float nota1, float nota2, float nota3) {
        float media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

}
