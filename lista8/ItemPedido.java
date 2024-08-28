/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// ItemPedido.java
public class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters e Setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Método para calcular o valor total do item
    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: R$" + String.format("%.2f", precoUnitario);
    }
}
