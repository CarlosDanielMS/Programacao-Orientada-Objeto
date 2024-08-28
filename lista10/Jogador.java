/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
// Jogador.java
public class Jogador {
    private String nome;
    private int nivel;
    private int pontuacao;

    // Construtor
    public Jogador(String nome, int nivel, int pontuacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Método para promover o jogador
    public void promover() {
        nivel++;
        System.out.println(nome + " foi promovido para o nível " + nivel + "!");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nível: " + nivel + ", Pontuação: " + pontuacao;
    }
}

