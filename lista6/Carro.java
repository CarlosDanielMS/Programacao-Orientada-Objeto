/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Carro.java
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double kilometragem;

    // Construtor
    public Carro(String marca, String modelo, int ano, double kilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
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

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    // Método para alterar a quilometragem total
    public void alterarKilometragem(double novaKilometragem) {
        if (novaKilometragem >= 0) {
            this.kilometragem = novaKilometragem;
            System.out.println("Kilometragem alterada para: " + kilometragem + " km");
        } else {
            System.out.println("A quilometragem não pode ser negativa.");
        }
    }

    // Método sobrecarregado para adicionar quilometragem de uma viagem
    public void alterarKilometragem(double quilometragemPercorrida, boolean viagem) {
        if (viagem && quilometragemPercorrida >= 0) {
            this.kilometragem += quilometragemPercorrida;
            System.out.println("Kilometragem após viagem: " + kilometragem + " km");
        } else {
            System.out.println("A quilometragem percorrida deve ser positiva para viagens.");
        }
    }

    @Override
    public String toString() {
        return "Carro: " + marca + " " + modelo + ", Ano: " + ano + ", Kilometragem: " + kilometragem + " km";
    }
}
