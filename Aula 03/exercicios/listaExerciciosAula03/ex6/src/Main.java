
// 6 - Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Computador comp = new Computador("Intel Core i7", 16, 512);
        int status = 0;
        while (true) {
            System.out.println("\nEspecificações:\nProcessador: " + comp.processador + "\nMemória RAM: " + comp.memoriaRAM + "\nArmazenamento: " + comp.armazenamento + " GB\n");
            System.out.println("O que deseja fazer ?\n1 - Ligar o computador\n2 - Desligar o computador\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                status = comp.ligar(status);
                break;
                case 2:
                status = comp.desligar(status);
                break;
                case 3:
                System.exit(0);
                default:
                break;
            }
        }

    }
}
