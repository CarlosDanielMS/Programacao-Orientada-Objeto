/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando um motor
        Motor motor = new Motor(150.0, "Gasolina");

        // Criando um veículo
        Veiculo veiculo = new Veiculo("Ford", "Mustang", 2024, motor);

        // Exibindo informações completas do veículo e do motor
        veiculo.exibirInformacoes();

        // Ligando o motor
        veiculo.ligarMotor();

        // Desligando o motor
        veiculo.desligarMotor();

        // Exibindo informações após mudanças
        veiculo.exibirInformacoes();
    }
}

