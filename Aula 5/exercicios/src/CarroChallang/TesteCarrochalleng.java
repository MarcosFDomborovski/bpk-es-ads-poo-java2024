package CarroChallang;

public class TesteCarrochalleng {
    public static void main(String[] args) {
        Motor motor = new Motor(200, "sla", TipoCombustivel.DIESEL, 100, 533, false);
        Carro carro = new Carro("Etios", motor);

        carro.ligarCarro();
        carro.acionarAcelerador(50);
        carro.trocarMarcha();
        carro.acionarAcelerador(50);
        carro.acionarFreio(30);
        carro.desligarCarro();
    }

}
