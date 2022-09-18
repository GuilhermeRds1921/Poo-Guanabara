package Aula07;

public class Luta {
//Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private Boolean aprovada;

//Construtor
    public Luta(Lutador ado, Lutador ante){
        this.setDesafiado(ado);
        this.setDesafiante(ante);
    }
//Getters
    private Lutador getDesafiado(){
        return this.desafiado;
    }
    private Lutador getDesafiante(){
        return this.desafiante;
    }
    private int getRound(){
        return this.rouds;
    }
    private Boolean getAprovada(){
        return this.aprovada;
    }

//Setters
    private void setDesafiado(Lutador lutad){
        this.desafiado = lutad;
    }
    private void setDesafiante(Lutador lutad){
        this.desafiante = lutad;
    }
    private void setRound(int num){
        this.rouds = num;
    }
    private void setAprovado(Boolean val){
        this.aprovada = val;
    }


}
