// 6 - Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.
public class Computador {
    String processador;
    int armazenamento;
    int memoriaRAM;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
    public int ligar(int status){
        if(status == 0){
            System.out.println("Você ligou o computador!");
            status = 1;
        } else {
            System.out.println("O computador já está ligado!");   
        }
        return status;
    }

    public int desligar(int status){
        if (status != 0){
            System.out.println("Você desligou o computador!");
            status = 0;
        } else {
            System.out.println("O computador já está desligado!");
        }
        return status;
    }


}
