// 10 - Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo("Sedan", "PL2-BJ4K", "Azul");
        int statusA = 0;
        int statusB = 0;
        while (true) {
            System.out.println("O que deseja fazer ?\n1 - Abastecer o veículo\n2 - Lavar o veículo\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (statusA == 3) {
                        System.out.println("O veículo já está com o tanque cheio.");
                        break;
                    }
                    statusA = veiculo.abastecer(statusA);
                    break;
                case 2:
                    if (statusB == 3) {
                        System.out.println("O veículo já está limpo.");
                        break;
                    }
                    statusB = veiculo.lavar(statusB);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}