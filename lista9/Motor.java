/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Motor.java
public class Motor {
    private double potencia; // em cavalos-vapor (cv)
    private String tipoCombustivel;
    private boolean estado; // true para ligado, false para desligado

    // Construtor
    public Motor(double potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.estado = false; // Motor inicia desligado
    }

    // Getters e Setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método para ligar o motor
    public void ligar() {
        if (!estado) {
            estado = true;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    // Método para desligar o motor
    public void desligar() {
        if (estado) {
            estado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    @Override
    public String toString() {
        return "Potência: " + potencia + " cv, Tipo de Combustível: " + tipoCombustivel + ", Estado: " + (estado ? "Ligado" : "Desligado");
    }
}
