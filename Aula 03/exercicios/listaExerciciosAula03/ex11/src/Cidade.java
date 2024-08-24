// 11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.
public class Cidade {
    String nome;
    int populacao;
    String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public int aumentarPopulacao(int quantidade) {
        System.out.println("Você aumentou a população  da cidade " + nome + " do Estado de " + estado + "em " + populacao + " pessoas.");
        populacao += quantidade;
        return populacao;
    }

    public int diminuirPopulacao(int quantidade) {
        if (quantidade >= populacao) {
            System.out.println("Você zerou a população da cidade " + nome + " do Estado de " + estado + ", tendo agora 0 pessoas.");
            populacao = 0;
        } else {
            System.out.println("Você diminuiu a população em " + populacao + " pessoas.");
            populacao -= quantidade;
        }
        return populacao;
    }
}