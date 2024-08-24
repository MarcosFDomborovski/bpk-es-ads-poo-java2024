// 8 - Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor("Roberval", "Matemática", 3000);
        while (true) {
            System.out.println("O que você deseja que o professor faça ?\n1 - Dar aula\n2 - Corrigir provas\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    professor.darAula();
                    break;
                case 2:
                    professor.corrigirProvas();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
