/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Gerente.java
public class Gerente extends Funcionario {
    private double bonusFixo;

    // Construtor
    public Gerente(String nome, double salario, double bonusFixo) {
        super(nome, salario, "Gerente");
        this.bonusFixo = bonusFixo;
    }

    // Getters e Setters
    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    // Sobrescreve o método para calcular o bônus
    @Override
    public double calcularBonus() {
        return bonusFixo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus Fixo: R$" + String.format("%.2f", bonusFixo);
    }
}
