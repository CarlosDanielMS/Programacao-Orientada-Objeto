/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Vendedor.java
public class Vendedor extends Funcionario {
    private double totalVendas;
    private double percentualBonus;

    // Construtor
    public Vendedor(String nome, double salario, double percentualBonus) {
        super(nome, salario, "Vendedor");
        this.percentualBonus = percentualBonus;
    }

    // Getters e Setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    // Sobrescreve o método para calcular o bônus
    @Override
    public double calcularBonus() {
        return totalVendas * (percentualBonus / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Total de Vendas: R$" + String.format("%.2f", totalVendas) + ", Percentual de Bônus: " + percentualBonus + "%";
    }
}
