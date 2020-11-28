package br.edu.iftm.teste;

import br.edu.iftm.rpg.Arena;
import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;

public class RpgTeste {
    public static void main(String[] args) {
        Inimigo hoppy = new Inimigo("Hoppy", 50, 10);
        Inimigo golen = new Inimigo("Golem", 75, 20);
        Jogador jogador = new Jogador("Garen", 100, 25);
        Arena luta = new Arena();

        System.out.println("Only PVP \n");
        System.out.println("O jogador " + jogador.getNome() + " está com " + jogador.getVidaJogador() + " de HP e possui " + jogador.getDanoJogador() + " de dano.");
        System.out.println("O inimigo " + hoppy.getNome() + " está com " + hoppy.getvidaInimigo() + " de HP e possui " + hoppy.getDanoinimigo() + " de dano.");
        System.out.println("O inimigo " + golen.getNome() + " está com " + golen.getvidaInimigo() + " de HP e possui " + golen.getDanoinimigo() + " de dano.\n" );

        luta.lutar(jogador, hoppy);
        luta.lutar(jogador, golen);
        
        jogador.JogadorAtacar();
        hoppy.inimigoAtacar();
        golen.inimigoAtacar();

        jogador.vidaJogador();
        hoppy.vidaInimigo();
        golen.vidaInimigo();

        luta.lutar(jogador, hoppy);
        luta.lutar(jogador, golen);
        
        jogador.JogadorAtacar();
        hoppy.inimigoAtacar();
        golen.inimigoAtacar();

        jogador.vidaJogador();
        hoppy.vidaInimigo();
        golen.vidaInimigo();

        luta.lutar(jogador, hoppy);
        luta.lutar(jogador, golen);
        
        jogador.JogadorAtacar();
        hoppy.inimigoAtacar();
        golen.inimigoAtacar();

        jogador.vidaJogador();
        hoppy.vidaInimigo();
        golen.vidaInimigo();

        System.out.println("");
    }

}