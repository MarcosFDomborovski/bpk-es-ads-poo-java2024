// 2 - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Celular pocket = new Celular("Samgung", "Pocket", 1500);
        Scanner sc = new Scanner(System.in);
        int status = 0;
        while (true) {
            System.out.println("Marca: " + pocket.marca + "\nModelo: " + pocket.modelo + "\nCapacidade da bateria: " + pocket.capacidadeBateria + "\n");
            System.out.println("O que deseja fazer ?\n1 - Ligar o celular\n2 - Desligar o celular\n3 - Sair");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    status = pocket.ligar(status);
                    break;
                case 2:
                    status = pocket.desligar(status);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }
}
