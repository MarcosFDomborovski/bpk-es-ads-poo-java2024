package ex_06;

public class Computador {
    private String processador;
    private int memoriaRam;
    private int armazenamento;

    public Computador(String processador, int memoriaRam, int armazenamento) {
        setProcessador(processador);
        setMemoriaRam(memoriaRam);
        setArmazenamento(armazenamento);
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if (processador != null) {
            this.processador = processador;
        }
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void desligar() {
        System.out.println("Desligando");
    }
}
