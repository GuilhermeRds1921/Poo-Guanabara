package Aula08;

import java.util.Random;

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

//Metodos Abstratos

    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria() == l2.getCategoria() ) && (l1 != l2)){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }
    public void lutar(){
        desafiado.apresentar();
        desafiante.apresentar();
        Random vencedor = new Random();

        switch(vencedor){
            case 0:
                System.out.println("Empatou ");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            case 1:
                System.out.println(desafiante.getNome() + " Venceu luta. ");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                
            case 2:
            System.out.println(desafiado.getNome() + " Venceu a luta. ");
            desafiado.ganharLuta();
            desafiante.perderLuta();

        }

    }
}
