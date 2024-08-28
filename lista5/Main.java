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
        // Criando um gerente
        Gerente gerente = new Gerente("Ana Souza", 8000.00, 2000.00);

        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Carlos Lima", 3000.00, 5.0);
        vendedor.setTotalVendas(100000.00); // Vendas realizadas pelo vendedor

        // Exibindo os detalhes e bônus dos funcionários
        System.out.println(gerente);
        System.out.println("Bônus do Gerente: R$" + String.format("%.2f", gerente.calcularBonus()));

        System.out.println(vendedor);
        System.out.println("Bônus do Vendedor: R$" + String.format("%.2f", vendedor.calcularBonus()));
    }
}

