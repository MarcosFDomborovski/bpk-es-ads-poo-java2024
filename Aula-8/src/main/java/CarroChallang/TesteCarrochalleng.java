package CarroChallang;

public class TesteCarrochalleng {
    public static void main(String[] args) {
        Motor motor1 = new Motor(5000, "V8", TipoCombustivel.GASOLINA, 0, 450, false);
        Carro carro1 = new Carro("Mustang", motor1);

        Motor motor2 = new Motor(3000, "V6", TipoCombustivel.DIESEL, 0, 250, false);
        Carro carro2 = new Carro("F-150", motor2);

        Motor motor3 = new Motor(0, "Elétrico", TipoCombustivel.ELETRICO, 0, 1020, false);
        Carro carro3 = new Carro("Tesla Model S", motor3);

        carro1.ligarCarro();
        carro1.acionarAcelerador(50);
        carro1.trocarMarcha();
        carro1.acionarAcelerador(50);
        carro1.acionarFreio(30);
        carro1.desligarCarro();

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

    }

}
