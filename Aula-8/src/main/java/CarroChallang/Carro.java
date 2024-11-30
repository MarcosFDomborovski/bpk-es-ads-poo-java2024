package CarroChallang;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acionarAcelerador(Integer incrementoRpm){
        motor.acelerar(incrementoRpm);
    }

    public void acionarFreio(Integer incrementoRpm){
        motor.reduzirRpm(incrementoRpm);
    }

    public void trocarMarcha(){
        System.out.println("A marcha foi trocada");
    }

    public void ligarCarro(){
        System.out.println("Carro ligado");
        motor.ligar();
    }

    public void desligarCarro(){
        System.out.println("Carro desligado");
        motor.desligar();
    }

    public void turboBoost(){
        System.out.println("vou aumentara a potencia desse bb em 50");
        motor.aumentarPotencia(50);
    }

    public void reduzirPotencia(){
        System.out.println("vou diminuir a potencia desse bb em 50");
        motor.reduzirPotencia(50);
    }

    @Override
    public String toString() {
        return "Carro: " + modelo + ", Motor: " + motor;
    }
}
