import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Marcos", 312314, "Engenharia de Software");
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        while (true) {
            System.out.println("Curso - " + aluno.curso + " .");
            System.out.println("O que deseja fazer ?\n1 - Calcular a média do aluno\n2 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Insira a primeira nota: ");
                    n1 = sc.nextFloat();
                    System.out.println("Insira a segunda nota: ");
                    n2 = sc.nextFloat();
                    System.out.println("Insira a terceira nota: ");
                    n3 = sc.nextFloat();

                    String notaFormatada = String.format("%.1f", aluno.calcularMedia(n1, n2, n3));
                    System.out.println("A média total do aluno " + aluno.nome + " - " + aluno.matricula + " é: " + notaFormatada + "\n");
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }

        }
    }
}
