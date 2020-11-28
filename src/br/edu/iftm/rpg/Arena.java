package br.edu.iftm.rpg;

public class Arena {

    private Jogador jogadores;
    private Inimigo inimigos;

    public void lutar(Jogador jogadores, Inimigo inimigos){

        if (jogadores.getVidaJogador() <= 0){                // Determinar se o jogador está morto
            System.out.println("O jogador está morto.");
        } else if (inimigos.getvidaInimigo() <= 0){
            System.out.println("O inimigo está morto.");
        }
        
        if (jogadores.getVidaJogador() >= 0){               // Condição para causar danos em jogadores.
            jogadores.setVidaJogador(jogadores.getVidaJogador() - inimigos.getDanoinimigo());
        }
        
        if (inimigos.getvidaInimigo() >= 0) {               // Condição para causar danos em inimigos.
            inimigos.setVidaInimigo(inimigos.getvidaInimigo() - jogadores.getDanoJogador());
        } 
    }    
}
