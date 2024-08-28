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
        // Criando um produto
        Produto produto = new Produto("Cadeira", 150.00, 20);

        // Exibindo o produto
        System.out.println(produto);

        // Adicionando e removendo produtos do estoque
        produto.adicionarEstoque(10);
        produto.removerEstoque(5);

        // Ajustando o preço do produto
        produto.ajustarPreco(10);  // Aumento de 10%

        // Exibindo o produto após ajustes
        System.out.println(produto);
    }
}
