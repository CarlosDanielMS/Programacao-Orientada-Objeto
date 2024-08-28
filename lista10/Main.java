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
        // Criando jogadores
        Jogador jogador1 = new Jogador("Alice", 1, 1200);
        Jogador jogador2 = new Jogador("Bob", 2, 800);
        Jogador jogador3 = new Jogador("Carlos", 3, 1500);

        // Criando o jogo
        Jogo jogo = new Jogo("Super Game", "2024-08-28");

        // Adicionando jogadores ao jogo
        jogo.adicionarJogador(jogador1);
        jogo.adicionarJogador(jogador2);
        jogo.adicionarJogador(jogador3);

        // Exibindo o ranking dos jogadores
        jogo.exibirRanking();

        // Promovendo jogadores
        jogo.promoverJogadores();

        // Exibindo o ranking dos jogadores após promoção
        jogo.exibirRanking();
    }
}

