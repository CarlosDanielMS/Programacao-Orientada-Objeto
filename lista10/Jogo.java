/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Jogo.java
public class Jogo {
    private String nome;
    private String dataLancamento;
    private List<Jogador> jogadores;

    // Construtor
    public Jogo(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.jogadores = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    // Método para adicionar um jogador
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador adicionado: " + jogador);
    }

    // Método para exibir o ranking dos jogadores baseado na pontuação
    public void exibirRanking() {
        Collections.sort(jogadores, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador j1, Jogador j2) {
                return Integer.compare(j2.getPontuacao(), j1.getPontuacao()); // Ordena em ordem decrescente
            }
        });

        System.out.println("Ranking dos Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    // Método para promover jogadores com base em sua pontuação
    public void promoverJogadores() {
        for (Jogador jogador : jogadores) {
            if (jogador.getPontuacao() > 1000) { // Condição para promoção
                jogador.promover();
            }
        }
    }

    @Override
    public String toString() {
        return "Jogo: " + nome + ", Data de Lançamento: " + dataLancamento;
    }
}

