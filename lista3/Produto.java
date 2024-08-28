/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Produto.java
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para adicionar produtos ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " unidades ao estoque. Novo estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    // Método para remover produtos do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= quantidadeEmEstoque) {
                quantidadeEmEstoque -= quantidade;
                System.out.println("Removido " + quantidade + " unidades do estoque. Novo estoque: " + quantidadeEmEstoque);
            } else {
                System.out.println("Quantidade a ser removida é maior do que a disponível no estoque.");
            }
        } else {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        }
    }

    // Método para ajustar o preço com base em um percentual
    public void ajustarPreco(double percentual) {
        if (percentual != 0) {
            preco += preco * (percentual / 100);
            System.out.println("Preço ajustado em " + percentual + "%. Novo preço: R$" + String.format("%.2f", preco));
        } else {
            System.out.println("Percentual de ajuste deve ser diferente de zero.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + String.format("%.2f", preco) + ", Quantidade em Estoque: " + quantidadeEmEstoque;
    }
}
