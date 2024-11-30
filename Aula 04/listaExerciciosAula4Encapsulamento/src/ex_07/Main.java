package ex_07;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123", "Computação");
        int media = aluno.calcularMedia(10, 4);
        System.out.println("O Aluno " + aluno.getNome() + " teve uma média de: " + media);
    }
}
