package CarroChallang;

import javax.swing.*;

public class Motor {
    private Integer cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private Integer rpm;
    private Integer potencia;
    private Boolean ligado;

    public Motor(Integer cilindradas, String modelo, TipoCombustivel tipoCombustivel, Integer rpm, Integer potencia, Boolean ligado) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
        this.ligado = ligado;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
        System.out.println("Motor foi ligado");
    }

    public void desligar(){
        this.ligado = false;
        System.out.println("Motor foi desligado");
    }

    public void aumentarPotencia(Integer incremento){
        this.potencia += incremento;
        System.out.println("Agora a potencia é de " + this.potencia);
    }

    public void reduzirPotencia(Integer decremento){
        this.potencia -= decremento;
        System.out.println("Agora a potencia é de " + this.potencia);
    }

    public void acelerar(Integer incrementoRpm){
        this.rpm += incrementoRpm;
        System.out.println("Agora a velocidad eh: " + this.rpm);
    }

    public void reduzirRpm(Integer incrementoRpm){
        this.rpm -= incrementoRpm;
        System.out.println("Agora a velocidad eh: " + this.rpm);
    }

    @Override
    public String toString() {
        return modelo + ", Tipo de Combustível: " + tipoCombustivel;
    }
}
