/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.List;

// Pedido.java
public class Pedido {
    private int numero;
    private String data;
    private List<ItemPedido> itens;

    // Construtor
    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    // Método para remover um item do pedido
    public void removerItem(String produto) {
        ItemPedido itemParaRemover = null;
        for (ItemPedido item : itens) {
            if (item.getProduto().equalsIgnoreCase(produto)) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
            System.out.println("Item removido: " + itemParaRemover);
        } else {
            System.out.println("Item com produto \"" + produto + "\" não encontrado.");
        }
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularValorTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido Nº: " + numero + ", Data: " + data + ", Itens: " + itens;
    }
}
