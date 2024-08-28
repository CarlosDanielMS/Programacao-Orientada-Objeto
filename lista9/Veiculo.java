/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Veiculo.java
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Método para ligar o motor do veículo
    public void ligarMotor() {
        motor.ligar();
    }

    // Método para desligar o motor do veículo
    public void desligarMotor() {
        motor.desligar();
    }

    // Método para exibir informações completas do veículo e do motor
    public void exibirInformacoes() {
        System.out.println("Veículo: " + marca + " " + modelo + ", Ano: " + ano);
        System.out.println("Informações do Motor: " + motor);
    }
}

