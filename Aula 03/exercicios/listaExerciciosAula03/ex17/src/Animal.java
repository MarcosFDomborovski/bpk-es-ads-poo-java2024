// 17 -Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.
public class Animal {
    String especie;
    int idade;
    double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(int foodChoice) {
        if (idade < 1) {
            System.out.println("\n\nO " + especie + " não tem idade suficiente para alimentar.\n");
            return;
        }
        if (foodChoice == 1) {
            System.out.println("\n\nO " + especie + " comeu um pedaço de plástico e morreu engasgado. Parabéns, desalmado!");
            System.exit(0);
        } else if (foodChoice == 2) {
            peso += 50;
            System.out.println("\n\nO " + especie + " comeu um bichinho menor e ganhou " + 50 + " gramas.");
            if (peso >= 300 && peso <= 400) {
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            } else if( peso >= 550){
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            }
            return;
        } else {
            peso += 32;
            System.out.println(
                    "\n\nO " + especie + " achou uma cenoura no caminho da toca, e comeu\n+ " + 32 + " gramas.");
            if (peso >= 300) {
                idade += 1;
                System.out.println("\nO " + especie + " envelheceu 1 ano!\n");
            }
            return;
        }
    }

    public int dormir(int status) {
        if (status == 0) {
            System.out.println("\n\nO " + especie + " está dormindo.\n");
            status = 1;
        } else {
            System.out.println("\n\nO " + especie + " acordou!\n");
            status = 0;
        }

        return status;
    }

}