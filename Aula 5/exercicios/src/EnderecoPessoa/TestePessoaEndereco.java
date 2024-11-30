package EnderecoPessoa;

public class TestePessoaEndereco {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("Pai", 54);
        Pessoa mae = new Pessoa("Mae", 53);
        Endereco endereco1 = new Endereco("avenida parana", "8736000", "Goioere");
        Endereco endereco2 = new Endereco("rua cessar lates", "875000", "toledo");
        pai.incluirEndereco(endereco1);
        System.out.println(pai);
        mae.incluirEndereco(endereco2);
        System.out.println(mae);
    }
}