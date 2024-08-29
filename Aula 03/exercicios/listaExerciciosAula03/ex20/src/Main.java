// 20 - Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Bicicleta bike = new Bicicleta("Shimano", "Mountain Bike", 29);
        System.out.println("\n\nBicicleta marca: " + bike.marca + "\nModelo: " + bike.modelo + "\nTamanho da roda: Aro "+ bike.tamanhoRoda);
        System.out.println("");
        int velocidade = 0;
        while (true) {
            if (velocidade > 70) {
                System.out.println(
                        "Você estava pedalando tão rápido que não conseguiu ver o Scania 113 branco a tempo. Você e o caminhão se tornaram 1.\nVocê morreu! ");
                return;
            }
            System.out.println("O que deseja fazer ?\n1 - Pedalar\n2 - Frear");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    velocidade = bike.pedalar(velocidade);
                    break;
                case 2:
                    velocidade = bike.frear(velocidade);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
