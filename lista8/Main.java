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
        // Criando itens de pedido
        ItemPedido item1 = new ItemPedido("Produto A", 3, 50.00);
        ItemPedido item2 = new ItemPedido("Produto B", 2, 30.00);
        ItemPedido item3 = new ItemPedido("Produto C", 1, 20.00);

        // Criando pedido
        Pedido pedido = new Pedido(12345, "2024-08-28");

        // Adicionando itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        // Exibindo o valor total do pedido
        System.out.println("Valor Total do Pedido: R$" + String.format("%.2f", pedido.calcularValorTotal()));

        // Removendo um item do pedido
        pedido.removerItem("Produto B");

        // Exibindo o valor total do pedido após remoção
        System.out.println("Valor Total do Pedido após remoção: R$" + String.format("%.2f", pedido.calcularValorTotal()));

        // Exibindo todos os itens do pedido
        System.out.println(pedido);
    }
}
