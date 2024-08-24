// 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.
public class Pessoa {
    String nome;
    int idade;
    int altura;

    public Pessoa(String nome, int idade, int altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentacao(){
        System.out.println("\nOlá! Eu me chamo " + nome + ", tenho "+ idade + " anos, e " + altura + "cm de altura.\n");
    }
}
