package br.edu.iftm.rpg;

public class Jogador {

    private String nome;
    private int vidaJogador;
    private int dano;
    private int pontos;
    
    public Jogador (String nome, int vidaJogador, int dano){
        this.nome = nome;
        this.vidaJogador = vidaJogador;
        this.dano = dano;
    }

    public void JogadorAtacar(){
        if (vidaJogador >= 0){       // Condição para não atacar morto.  
        System.out.println("O jogador " + nome + " está atancando seus inimigos.");  
        }      
    }

    public String vidaJogador(){
        pontos = getVidaJogador();
        if (pontos <= 0){           // Condição para determinar se o jogador está vivo ou morto.
            System.out.println("O jogador "+ nome + " está morto!");
        }  else {
            System.out.println("O jogador "+ nome + " está com " + getVidaJogador() + " de vida.");
        } 
        return " ";
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nomeJogador){
        this.nome = nomeJogador;
    }
    public int getVidaJogador(){
        return vidaJogador;
    }
    public void setVidaJogador(int vidaJogador){
        this.vidaJogador = vidaJogador;
    }
    public int getDanoJogador(){
        return dano;
    }
    public void setDanoJogador(int danoJogador){
        this.dano = danoJogador;
    }

}
