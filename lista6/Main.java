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
        // Criando um carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 15000.0);

        // Exibindo o estado inicial do carro
        System.out.println(carro);

        // Alterando a quilometragem total
        carro.alterarKilometragem(16000.0);

        // Adicionando quilometragem de uma viagem
        carro.alterarKilometragem(200.0, true);

        // Tentando adicionar uma quilometragem negativa (deve exibir uma mensagem de erro)
        carro.alterarKilometragem(-50.0, true);

        // Exibindo o estado final do carro
        System.out.println(carro);
    }
}

