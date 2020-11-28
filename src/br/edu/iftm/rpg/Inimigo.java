package br.edu.iftm.rpg;

public class Inimigo {

    private String nome;
    private int vidaInimigo;
    private int dano;
    private int pontos;

    public Inimigo (String nome, int vidaInimigo, int dano){
        this.nome = nome;
        this.vidaInimigo = vidaInimigo;
        this.dano = dano;
    }

	public void inimigoAtacar(){
        if (vidaInimigo >= 0) {         // Condição para não atacar morto.
        System.out.println("O inimigo " + nome + " está atancando.");  
        }    
     }
    
    public String vidaInimigo(){
        pontos = getvidaInimigo();
        if (pontos <= 0){           // Condição para determinar se o inimigo está vivo ou morto.
            System.out.println("O inimigo "+ nome + " está morto!");
        }  else {
            System.out.println("O inimigo "+ nome + " está com " + getvidaInimigo() + " de vida.");
        } 
        return " ";
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nomeInimigo){
        this.nome = nomeInimigo;
    }
    public int getvidaInimigo(){
        return vidaInimigo;
    }
    public void setVidaInimigo(int vidaInimigo){
        this.vidaInimigo = vidaInimigo;
    }
    public int getDanoinimigo(){
        return dano;
    }
    public void setDanoinimigo(int danoInimigo){
        this.dano = danoInimigo;
    }

    
}
